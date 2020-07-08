package cl.clh.tramos.soap;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import cl.clh.tramos.soap.dto.Login;
import cl.clh.tramos.soap.dto.LoginResponse;
import cl.clh.tramos.soap.dto.ObjectFactory;
import cl.clh.tramos.soap.dto.Respuesta;


public class AutenticacionClient extends WebServiceGatewaySupport {
   
	public String getAutenticacionToken(){
		ObjectFactory fact = new ObjectFactory();   

		Login login = new Login();
		login.setLoginUsuario(fact.createLoginLoginUsuario("carga_10106"));
		login.setCodigoEntidad(10106);
		login.setClaveUsuario(fact.createLoginClaveUsuario("abc123"));
	
	    String ret = "";


		try {
			
			String strXML =((LoginResponse)getWebServiceTemplate().marshalSendAndReceive(login)).getReturn().getValue();
			
			strXML= strXML.substring(strXML.indexOf("\n"), strXML.length());
			strXML.replace("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>", "");
			ret = strXML.substring(strXML.indexOf("<Mensaje>") + 9, strXML.indexOf("</Mensaje>"));
			JAXBContext jaxbContext = JAXBContext.newInstance(Respuesta.class);
		    Unmarshaller jaxbUnmarshaller = null;
			jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			//respuesta = (Respuesta) jaxbUnmarshaller.unmarshal(new StringReader(strXML));
			
			

		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
	    System.out.println(ret);
		return ret;
       
    }

}
