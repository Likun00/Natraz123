package com.CountryService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.CountryService.beans.Country;
import com.CountryService.service.CountryService;


@RestController
public class CountryController {
	
	@Autowired
	CountryService obj;
	
	@RequestMapping("/getcountries")
	public List getCountries()
	{
		return obj.getAllCountries();
	}
	
	@RequestMapping("/getcountries/{id}")
	public Country getCountryById(@PathVariable(value="id")int id)
	{
		return obj.getCountrybyID(id);
	}
	
	@RequestMapping("/getcountries/countryname")
	public Country getCountryByNmae(@RequestParam(value="name")String countryname)
	{
		return obj.getCountrybyName(countryname);
	}
}
