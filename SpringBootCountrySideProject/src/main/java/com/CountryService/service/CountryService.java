package com.CountryService.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Component;

import com.CountryService.beans.Country;
@Component
public class CountryService {

	static HashMap<Integer, Country> countryIdMap;

	public List<CountryService> countryService() {
		countryIdMap = new HashMap<Integer, Country>();

		Country indiaCountry = new Country(1, "india", "delhi");
		Country usaCountry = new Country(2, "usa", "dc");

		countryIdMap.put(1, indiaCountry);
		countryIdMap.put(2, usaCountry);
		System.out.println(countryIdMap);
		List countries=new ArrayList(countryIdMap.values());
		return countries;
 
	}//countryService() end
	public List getAllCountries() 
	{
	/*	List countries=new ArrayList(countryIdMap.values()); 
		return countries ;*/
		countryIdMap = new HashMap<Integer, Country>();

		Country indiaCountry = new Country(1, "india", "delhi");
		Country usaCountry = new Country(2, "usa", "dc");

		countryIdMap.put(1, indiaCountry);
		countryIdMap.put(2, usaCountry);
		System.out.println(countryIdMap);
		List countries=new ArrayList(countryIdMap.values());
		return countries;
		
	}
	public Country getCountrybyID(int id)
	{
		Country country=countryIdMap.get(id);
		return null;
		
	}
	public Country getCountrybyName(String countryName)
	{
		Country country=null;
		for(int i:countryIdMap.keySet())
		{
			if(countryIdMap.get(i).getCountryName().equals(countryName))
				country=countryIdMap.get(i);
		}
		return country;
	
	}
	

	
	 
}
