package com.qsp.springbootnativequery.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.qsp.springbootnativequery.dto.Country;

import jakarta.transaction.Transactional;

public interface CountryRepository extends JpaRepository<Country,Integer>{
	@Modifying(clearAutomatically = true)
	@Transactional
	@Query(value="insert into country(countrycode,countrycapital,countryname,countrystate)"
+ "values(:#{#country.countrycode},:#{#country.countrycapital},:#{#country.countryname},:#{#country.countrystate})",nativeQuery = true)
	public void saveCountry(@Param("country")Country country);
//display
	@Query(value = "select* from country",nativeQuery = true)
 public List<Country> displayAllCountry();
	//delete method
	@Modifying(clearAutomatically = true)
	@Transactional
	@Query(value="delete from country where countrycode=?1",nativeQuery = true)
	public void deleteCountry(int id);
	
	//u[date method
	@Modifying(clearAutomatically = true)
	@Transactional
	@Query(value = "update country set countryname=?1,countrycapital=?2 where countrycode =?3", nativeQuery = true)
	public void updateCountry(String countryname,String countrycapital, int coutrycode);
}
