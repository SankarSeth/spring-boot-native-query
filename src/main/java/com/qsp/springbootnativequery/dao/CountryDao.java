package com.qsp.springbootnativequery.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.qsp.springbootnativequery.dto.Country;
import com.qsp.springbootnativequery.repository.CountryRepository;
@Repository
public class CountryDao {
	@Autowired
	CountryRepository countryRepository;
	//insert method for country
	public void saveCountry(Country country) {
		 countryRepository.saveCountry(country);
	}
//display metho
	public List<Country> displayAllCountry(){
		return countryRepository.displayAllCountry();
		
	}
	//delete method
	public void deleteCountry(int id) {
		countryRepository.deleteCountry(id);
	}
	//update method
	public void updateCountry(String countryname,String countrycapital, int coutrycode) {
		countryRepository.updateCountry(countryname, countrycapital, coutrycode);
	}
       
	
	
}
