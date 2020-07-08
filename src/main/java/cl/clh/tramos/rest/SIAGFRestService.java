package cl.clh.tramos.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.clh.tramos.dto.Propuesta;
import cl.clh.tramos.dto.ResponseAPI;
import cl.clh.tramos.service.EscritorioService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/siagf")
public class SIAGFRestService {
	
	private static final Logger logger = LoggerFactory.getLogger(SIAGFRestService.class);
		
	private ResponseAPI response;
		
	@Autowired
	private EscritorioService service;
	
	@GetMapping
	public List<Propuesta> buscarPreresult(@RequestParam String periodo,  @RequestParam String rutEmpresa) throws NoSuchFieldException, SecurityException{
				
			return service.buscarPreresult(periodo, rutEmpresa);
		
	}	

	
	@PostMapping("/actualizar")
	public boolean actualizarCausante(@RequestBody Propuesta propuesta) throws SecurityException{
		
		return service.invocarServicioSiagf(propuesta);		
	
	}

		
}
