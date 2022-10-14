package com.CountryService.beans;

public class Country {
	int id;
	String CountryName;
	String Capital;
	
	public Country(int id, String countryName, String capital) {
		super();
		this.id = id;
		CountryName = countryName;
		Capital = capital;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCountryName() {
		return CountryName;
	}
	public void setCountryName(String countryName) {
		CountryName = countryName;
	}
	public String getCapital() {
		return Capital;
	}
	public void setCapital(String capital) {
		Capital = capital;
	}
	

}
