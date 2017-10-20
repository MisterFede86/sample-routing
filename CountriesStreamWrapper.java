package test.countries.springSecuritywithRest.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;;

@JsonIgnoreProperties(ignoreUnknown=true)
public class CountriesStreamWrapper {
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("currencies")
	private CurrenciesStreamWrapper currenciesStreamWrapper;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CurrenciesStreamWrapper getCurrenciesStreamWrapper() {
		return currenciesStreamWrapper;
	}

	public void setCurrenciesStreamWrapper(CurrenciesStreamWrapper currenciesStreamWrapper) {
		this.currenciesStreamWrapper = currenciesStreamWrapper;
	}

}
