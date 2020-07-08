package cl.clh.tramos.soap;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SoapClientConfig {
	

	@Bean
    public Jaxb2Marshaller marshaller(){
        Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
        jaxb2Marshaller.setContextPath("cl.clh.tramos.soap.dto");
        Map<String, Object> properties = new HashMap<String, Object>();
        //properties.put("com.sun.xml.bind.xmlHeaders", "<?xml version=\"1.0\"?");

        jaxb2Marshaller.setMarshallerProperties(properties);
        return jaxb2Marshaller;
    }

    @Bean
    public AutenticacionClient autenticacionClient(Jaxb2Marshaller jaxb2Marshaller) {
    	AutenticacionClient autenticacionClient = new AutenticacionClient();
    	autenticacionClient.setDefaultUri("http://siagfqa.paperless.cl:80/axis2/services/Autenticacion");
    	autenticacionClient.setMarshaller(jaxb2Marshaller);
    	autenticacionClient.setUnmarshaller(jaxb2Marshaller);
        return autenticacionClient;
    }
    
    @Bean
    public ActualizaCausanteClient actualizaCausanteClient(Jaxb2Marshaller jaxb2Marshaller) {
    	ActualizaCausanteClient actualizaCausanteClient = new ActualizaCausanteClient();
    	actualizaCausanteClient.setDefaultUri("http://siagfqa.paperless.cl:80/axis2/services/ActualizarCausante");
    	actualizaCausanteClient.setMarshaller(jaxb2Marshaller);
    	actualizaCausanteClient.setUnmarshaller(jaxb2Marshaller);
        return actualizaCausanteClient;
    }
    
    @Bean
    public ConsultaCausanteClient consultaCausanteClient(Jaxb2Marshaller jaxb2Marshaller) {
    	ConsultaCausanteClient consultaCausanteClient = new ConsultaCausanteClient();
    	consultaCausanteClient.setDefaultUri("http://siagfqa.paperless.cl:80/axis2/services/ConsultaCausante");
    	consultaCausanteClient.setMarshaller(jaxb2Marshaller);
    	consultaCausanteClient.setUnmarshaller(jaxb2Marshaller);
        return consultaCausanteClient;
    }
}
