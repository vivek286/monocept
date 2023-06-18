package com.monocept.assesment;

public class Country {
private String regionid;
private String country;
private String countryCode;
public String getRegionid() {
	return regionid;
}
public void setRegionid(String regionid) {
	this.regionid = regionid;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getCountryCode() {
	return countryCode;
}
public void setCountryCode(String countryCode) {
	this.countryCode = countryCode;
}
public Country(String regionid, String country, String countryCode) {
	super();
	this.regionid = regionid;
	this.country = country;
	this.countryCode = countryCode;
}

}
