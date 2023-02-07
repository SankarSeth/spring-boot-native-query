package com.qsp.springbootnativequery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.springbootnativequery.dto.Country;
import com.qsp.springbootnativequery.service.CountryService;
@RestController
public class CountryController {
	
	@Autowired
	CountryService countryService;
	
	@PostMapping("/insertcountry")
	public Country saveCountry(@RequestBody Country country) {
		return countryService.saveCountry(country);	
	}
	//display method
	@GetMapping("/getAllCountry")
			public List<Country> displayAllCountry(){
				return countryService.displayAllCountry();
				
			}
	@DeleteMapping("/deletecountry/{id}")
	public String deleteCountry(@PathVariable int id) {
		return countryService.deleteCountry(id);
	}
	//update method
	@PutMapping("/updatecountry/{countryname}/{countrycapital}/{countrycode}")
	public String updateCountry(@PathVariable String countryname,@PathVariable String countrycapital, @PathVariable int coutrycode) {
	return countryService.updateCountry(countryname, countrycapital, coutrycode);
			
			}

}
