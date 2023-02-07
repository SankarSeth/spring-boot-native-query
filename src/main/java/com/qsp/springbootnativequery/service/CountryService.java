package com.qsp.springbootnativequery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qsp.springbootnativequery.dao.CountryDao;
import com.qsp.springbootnativequery.dto.Country;

@Service
public class CountryService {
	@Autowired
	CountryDao countryDao;
	
	public Country saveCountry(Country country) {
	 countryDao.saveCountry(country);
	return country;
		
	}
	//display metho
		public List<Country> displayAllCountry(){
			return countryDao.displayAllCountry();
			
		}
		//delete method
		public String deleteCountry(int id) {
			 countryDao.deleteCountry(id);
			return "data deleted";
		}
	
		//update method
		public String updateCountry(String countryname,String countrycapital, int coutrycode) {
		 countryDao.updateCountry(countryname, countrycapital, coutrycode);
		return "data updated";
		}

}
