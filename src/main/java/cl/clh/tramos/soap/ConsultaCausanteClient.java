package cl.clh.tramos.soap;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import cl.clh.tramos.soap.dto.Causante;
import cl.clh.tramos.soap.dto.ConsultaCausante;
import cl.clh.tramos.soap.dto.ConsultaCausanteResponse;
import cl.clh.tramos.soap.dto.ObjectFactory;


public class ConsultaCausanteClient extends WebServiceGatewaySupport {
   
	public Causante getCausante(String token, String rut){
		ObjectFactory fact = new ObjectFactory();   

		ConsultaCausante consultaCausante = new ConsultaCausante();
		consultaCausante.setToken(fact.createConsultaCausanteToken(token));
		consultaCausante.setRutCausante(fact.createConsultaCausanteRutCausante(rut));
	
	    Causante causante = new Causante();


		String strXML =((ConsultaCausanteResponse)getWebServiceTemplate().marshalSendAndReceive(consultaCausante)).getReturn().getValue();
		
		strXML.replace("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>", "");
		causante.setCodTipoBeneficio(strXML.substring(strXML.lastIndexOf("<CodTipoBeneficio>") + 18, strXML.lastIndexOf("</CodTipoBeneficio>")));
		causante.setRutCausante(strXML.substring(strXML.lastIndexOf("<RutCausante>") + 13, strXML.lastIndexOf("</RutCausante>")));
		causante.setCodTipoCausante(strXML.substring(strXML.lastIndexOf("<CodTipoCausante>") + 17, strXML.lastIndexOf("</CodTipoCausante>")));
		causante.setFecRecCausante(strXML.substring(strXML.lastIndexOf("<FecRecCausante>") + 16, strXML.lastIndexOf("</FecRecCausante>")));
	     
		return causante;
       
    }

}
