package cl.clh.tramos.service;

import java.text.SimpleDateFormat;
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
import cl.clh.tramos.model.DatosXmlSiagf;
import cl.clh.tramos.model.Preresult;
import cl.clh.tramos.model.PropuestasSiagf;
import cl.clh.tramos.repository.DatosSiagfXMLRepository;
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
	
	@Autowired
	private DatosSiagfXMLRepository datosSiagfXMLRepository;

	
	@Transactional
	public void persistPropuestasSiagf(PropuestasSiagf propuestaSiagf) {
		propuestas_SiagfRepository.save(propuestaSiagf);
	}
	
	@Transactional
	public void persistDataXMLSiagf(DatosXmlSiagf datosXmlSiagf) {
		datosSiagfXMLRepository.save(datosXmlSiagf);
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
				montoUnitario = 11887;
				break;
			case "B":
				tramo = 2;
				montoUnitario = 7259;
				break;
			case "C":
				tramo = 3;
				montoUnitario = 2295;
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
		
		
		String pattern = "yyyyMMdd HH:mm:ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		String dateNow = simpleDateFormat.format(new Date());
		
		if(respuesta != null) {
			DatosXmlSiagf ds = new DatosXmlSiagf();
			ds.setCodEstadoSiagf(Integer.parseInt(respuesta.getCodigo()));
			ds.setActeco("");
			ds.setCodentidadadm("");
			ds.setCodtipobeneficio(causante.getCodTipoBeneficio());
			ds.setCodtipocausante(causante.getCodTipoCausante());
			ds.setFechaemision(dateNow);
			ds.setFecpagobeneficio(propuesta.getFecGener());
			ds.setFecreccausante(causante.getFecRecCausante());
			ds.setIngpromedio(propuesta.getRentaProm().toString());
			ds.setMontounitariobeneficio(montoUnitario + "");
			ds.setNombrebeneficiario(propuesta.getNameFirst() + " " + propuesta.getNameLast() + " " + propuesta.getNameLst2());
			ds.setNumtramo(tramo + "");
			ds.setPeriodo(propuesta.getPeriodo());			
			ds.setRutbeneficiario(propuesta.getRutAfiliado());
			ds.setRutcausante(causante.getRutCausante());
			ds.setTipobeneficiario(causante.getCodTipoBeneficio());
			ds.setTramoasigfam("");
			ds.setWsCodigo((respuesta.getCodigo()));
			ds.setWsMensaje(respuesta.getMensaje());
			ds.setWsNroatencion(respuesta.getNroAtencion());
			ds.setWsNrodocumento(respuesta.getNroDocumento());
						
			persistDataXMLSiagf(ds);			
			return true;
		}
		else
			return false;
		
		
	}
	


}
