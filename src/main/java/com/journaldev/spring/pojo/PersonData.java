package com.journaldev.spring.pojo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PersonData {
	
	
	String personId;
	
	@NotNull
    @Size(min = 1, max = 14,message="Length should be between 1 and 14")
	String personName;
	
	String countryname;
	
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	
	public String getCountryname() {
		return countryname;
	}
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	
	public String getPersonId() {
		return personId;
	}
	public void setPersonId(String personId) {
		this.personId = personId;
	}
}
