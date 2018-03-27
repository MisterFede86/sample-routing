package cb.countries.samplerouting.controller;

import org.json.simple.JSONArray;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import cb.countries.samplerouting.bean.JsonCountry;;

@Controller
public class CountriesController
{
	
	
	@RequestMapping(value = "/countries", method = RequestMethod.POST)
	 public @ResponseBody String getCountries()
	 {
			
		RestTemplate restTemplate = new RestTemplate();
	    ResponseEntity<String> response = restTemplate.getForEntity(
	            "http://restcountries.eu/rest/v2/all",
	            String.class);
	    Gson gsonReaded = new Gson();
      
       JsonCountry[] jsonPatternCountryList = gsonReaded.fromJson(response.getBody().toString(), JsonCountry[].class);
       
       Gson documento = new Gson();
       JSONArray objCountryList =   new JSONArray();
       String countriesList = null ;
       
       for(int i=0;i<jsonPatternCountryList.length;i++) {
       	
            JsonObject objCurrency = new JsonObject();
            objCurrency.addProperty("currencyName",jsonPatternCountryList[i].getCurrencies().get(0).getName());
            JsonObject objCountryName = new JsonObject();
            objCountryName.addProperty("Name", jsonPatternCountryList[i].getName());
            objCountryName.add("Currency", objCurrency);
            objCountryList.add(i,objCountryName);
	
	  
	 }
       
       	countriesList =  documento.toJson(objCountryList);
		return countriesList;
		
	
	
	 }

		
}
