package cl.clh.tramos.rest;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.clh.tramos.dto.Propuesta;
import cl.clh.tramos.dto.ResponseAPI;
import cl.clh.tramos.service.BpmTaskService;
import cl.clh.tramos.service.CSVService;
import cl.clh.tramos.service.EscritorioService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/propuesta")
public class PreresultRestService {
	
	private static final Logger logger = LoggerFactory.getLogger(PreresultRestService.class);
		
	private ResponseAPI response;
	
	
	@Autowired
	private EscritorioService service;
	
	@Autowired
	private BpmTaskService bpmService;

	@Autowired
	private CSVService csvService;

	
	@GetMapping
	public List<Propuesta> buscarPreresult(@RequestParam String periodo,  @RequestParam String rutEmpresa) throws NoSuchFieldException, SecurityException{
				
			return service.buscarPreresult(periodo, rutEmpresa);
		
	}	

	@RequestMapping("/bpm")
	@GetMapping
	public List<Propuesta> buscarPropuestasBPM(@RequestParam String usuario,  @RequestParam String pass) throws NoSuchFieldException, SecurityException{
				
			return bpmService.getCurrentTask(usuario, pass);
		
	}
	
	@PostMapping("/bpm/completeTask")
	public void completarConArchivoCargadoBPM(@RequestParam String rutEmpresa, @RequestParam String user,  @RequestParam String pass) throws NoSuchFieldException, SecurityException{
				
		List<Propuesta> propuestas = csvService.readFile(rutEmpresa + ".csv");
		HashMap<String, Object> vars = new HashMap<>();
		for(Propuesta propuesta:propuestas) {
			propuesta.setEst1(new Date().toGMTString());
			propuesta.setEst2("Declarado");
			propuesta.setUsuario(user);
		}
		vars.put("propuestasOUT", propuestas);
		bpmService.completeTask(user, pass, vars);
		
	}

		
}
