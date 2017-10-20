package test.countries.springSecuritywithRest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class CountriesController
{
	
	

	@RequestMapping(value = "/countries", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	 public @ResponseBody ResponseEntity<String> getCountries()
	 {
	
	

	    RestTemplate restTemplate = new RestTemplate();
	    ResponseEntity<String> response = restTemplate.getForEntity(
	            "http://restcountries.eu/rest/v2/all",
	            String.class);

	    if (HttpStatus.OK == response.getStatusCode()) {
	        System.out.println("prova "+ response);
	    } else {
	        // log error, retry or ? 
	    }
	  
//	    HttpHeaders headers = new HttpHeaders();
//        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
//
//     ParameterizedTypeReference<List<CountriesStreamWrapper>> responseType = new ParameterizedTypeReference<List<CountriesStreamWrapper>>() {};
//		  RestTemplate restTemplate = new RestTemplate();
//		 ResponseEntity<List<CountriesStreamWrapper>> response = restTemplate.exchange( "http://restcountries.eu/rest/v2/all",
//				 HttpMethod.GET , entity, responseType);  
	    
	
	  return response;
	 }
		
	
	

	 

		
}