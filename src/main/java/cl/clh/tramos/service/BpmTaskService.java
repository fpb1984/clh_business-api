package cl.clh.tramos.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import cl.clh.tramos.dto.Propuesta;
import cl.clh.tramos.dto.ResponseAPI;


@Service
public class BpmTaskService {


	public List<Propuesta> getCurrentTask(String user, String pass) {
		
		
		  final String uri = "http://localhost:8082/rgp-kieserver-client-api/pam/getCurrentTaskVars?userId=" + user +"&pass=" + pass;
		     System.out.println(uri);
		    RestTemplate restTemplate = new RestTemplate();
		    ResponseAPI result = restTemplate.getForObject(uri, ResponseAPI.class);
		    
	        ObjectMapper mapper = new ObjectMapper();

		    List<Propuesta> propuestas = mapper.convertValue(((HashMap<String,Object>)result.getData()).get("propuestas"), new TypeReference<List<Propuesta>>(){});
	        
	        return propuestas;   
	    
	}
	
	public void completeTask(String user, String pass, HashMap<String, Object> vars) {
		  final String uri = "http://localhost:8082/rgp-kieserver-client-api/pam/completeStartTask?userId=" + user +"&pass=" + pass;
		  RestTemplate restTemplate = new RestTemplate();
          HttpEntity<HashMap<String, Object>> request = new HttpEntity<>(vars);
          restTemplate.postForLocation(uri, request);
	}

	
}