package test.countries.springSecuritywithRest.bean;

import java.util.ArrayList;

public class JsonCountry {
	
	 String name;
	 ArrayList<CurrenciesStreamWrapper> currencies;
	 
	public ArrayList<CurrenciesStreamWrapper> getCurrencies() {
		return currencies;
	}
	public void setCurrencies(ArrayList<CurrenciesStreamWrapper> currencies) {
		this.currencies = currencies;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
	public class CurrenciesStreamWrapper {
		
		private String code;
		private String name;
		private String symbol;
		
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSymbol() {
			return symbol;
		}
		public void setSymbol(String symbol) {
			this.symbol = symbol;
		}
	}

	 

}
