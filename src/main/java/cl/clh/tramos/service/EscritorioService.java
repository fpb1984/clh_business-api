package cl.clh.tramos.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.clh.tramos.dto.Propuesta;
import cl.clh.tramos.model.Preresult;
import cl.clh.tramos.model.PropuestasSiagf;
import cl.clh.tramos.repository.PreresultRepository;
import cl.clh.tramos.repository.Propuestas_SiagfRepository;
import cl.clh.tramos.soap.ActualizaCausanteClient;
import cl.clh.tramos.soap.AutenticacionClient;
import cl.clh.tramos.soap.ConsultaCausanteClient;
import cl.clh.tramos.soap.SoapClientConfig;
import cl.clh.tramos.soap.dto.Causante;
import cl.clh.tramos.soap.dto.Respuesta2;


@Service
public class EscritorioService {
	
	private static final Logger logger = LoggerFactory.getLogger(EscritorioService.class);
		
	@Autowired
	private Propuestas_SiagfRepository propuestas_SiagfRepository;
	
	@Autowired
	private PreresultRepository preresultRepository;
	
	@Autowired
	private AutenticacionClient aClient;

	
	@Transactional
	public void persistPropuestasSiagf(PropuestasSiagf propuestaSiagf) {
		propuestas_SiagfRepository.save(propuestaSiagf);
	}
	
	@Transactional
	public List<PropuestasSiagf> buscarPropuestasSiagf() {
		List<PropuestasSiagf> propuestas = propuestas_SiagfRepository.findAll();
		return propuestas;
	}
	
	@Transactional
	public List<Propuesta> buscarPreresult(String periodo, String rutEmpresa) {
		
		List<Preresult> resultados = preresultRepository.findByPeriodo(periodo, rutEmpresa);
		List<Propuesta> propuestas = new ArrayList<>();
		for (Preresult pr:resultados) {
			propuestas.add(new Propuesta(pr));
		}
	
		return propuestas;
		
	}
	
	@Transactional
	public boolean invocarServicioSiagf(Propuesta propuesta) {
		
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SoapClientConfig.class);

		AutenticacionClient autenticacionClient = annotationConfigApplicationContext.getBean(AutenticacionClient.class);
		String token = autenticacionClient.getAutenticacionToken();
		ConsultaCausanteClient consultaCausanteClient = annotationConfigApplicationContext.getBean(ConsultaCausanteClient.class);
		
		Causante causante = consultaCausanteClient.getCausante(token, propuesta.getRutAfiliado());
		
		ActualizaCausanteClient actualizaCausanteClient = annotationConfigApplicationContext.getBean(ActualizaCausanteClient.class);
		int tramo;
		int montoUnitario;
		switch(propuesta.getTramo()) {
		
					case "A":
				tramo = 1;
				montoUnitario = 12364;
				break;
			case "B":
				tramo = 2;
				montoUnitario = 7587;
				break;
			case "C":
				tramo = 3;
				montoUnitario = 2398;
				break;
			case "D":
				tramo = 4;
				montoUnitario = 0;
				break;
			default:
				tramo = 4;
				montoUnitario = 0;
				break;
		}
		Respuesta2 respuesta = actualizaCausanteClient.modificarCausante(token, propuesta.getRutAfiliado(), propuesta.getRentaProm(), propuesta.getPeriodo(), tramo,montoUnitario, causante);
			
		if(respuesta != null) {
			PropuestasSiagf ps = new PropuestasSiagf();
			ps.setCodEstadoFinal(Integer.parseInt(respuesta.getCodigo()));
			ps.setCodEstadoSiagf(Integer.parseInt(respuesta.getCodigo()));
			ps.setMensajeSiagf(respuesta.getMensaje());
			ps.setFecModificaSiagf(new Timestamp((new Date()).getTime()));
			ps.setMandt(propuesta.getMandt());
			ps.setNameFirst(propuesta.getNameFirst());
			ps.setNameLast(propuesta.getNameLast());
			ps.setNameLst2(propuesta.getNameLst2());
			ps.setNumMeses(propuesta.getNumMeses());
			ps.setOtraRem(propuesta.getOtraRem());
			ps.setDecJurada(propuesta.getDecJurada());
			ps.setPartner(propuesta.getPartner());
			ps.setPensiones(propuesta.getPensiones());
			ps.setPeriodo(propuesta.getPeriodo());
			ps.setRemEmp(propuesta.getRemEmp());
			ps.setRentaProm(propuesta.getRentaProm());
			ps.setRentasInd(propuesta.getRentasInd());		
			ps.setRutAfiliado(propuesta.getRutAfiliado());
			ps.setRutEmpresa(propuesta.getRutEmpresa());
			ps.setSubsidios(propuesta.getSubsidios());
			ps.setTieneCarga(propuesta.getTieneCarga());
			ps.setTotIngresos(propuesta.getTotIngresos());
			ps.setTramo(propuesta.getTramo());
			ps.setUsuario(propuesta.getUsuario());
			ps.setWaers(propuesta.getWaers());
			
			persistPropuestasSiagf(ps);
			
			return true;
			
		}
		else
			return false;
		
		
	}
	


}
