package com.qsp.springbootnativequery.dto;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "country")
public class Country {
	@Id
	@Column(name="countrycode")
	private int countrycode;
	@Column(name="countryname")
	private String countryname;
	@Column(name="countrystate")
	private String countrystate;
	@Column(name="countrycapital")
	private String countrycapital;
	public int getCountrycode() {
		return countrycode;
	}
	public void setCountrycode(int countrycode) {
		this.countrycode = countrycode;
	}
	public String getCountryname() {
		return countryname;
	}
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	public String getCountrystate() {
		return countrystate;
	}
	public void setCountrystate(String countrystate) {
		this.countrystate = countrystate;
	}
	public String getCountrycapital() {
		return countrycapital;
	}
	public void setCountrycapital(String countrycapital) {
		this.countrycapital = countrycapital;
	}
	
}
