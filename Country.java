package test.countries.springSecuritywithRest.bean;

public class Country {
	
	 String countryName;
	 String currenciesName; 
	 
	public Country(String countryName,String currenciesName) {
	  super();
	  this.countryName = countryName;
	  this.currenciesName = currenciesName;
	 }
	 public String getCountryName() {
	  return countryName;
	 }
	 public void setCountryName(String countryName) {
	  this.countryName = countryName;
	 } 
	 public String getCurrenciesName() {
			return currenciesName;
	}
	public void setCurrenciesName(String currenciesName) {
			this.currenciesName = currenciesName;
	}
}
