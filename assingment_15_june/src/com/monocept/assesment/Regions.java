package com.monocept.assesment;

public class Regions {
private int regionid;
private String region;
public int getRegionid() {
	return regionid;
}
public void setRegionid(int regionid) {
	this.regionid = regionid;
}
public String getRegion() {
	return region;
}
public void setRegion(String region) {
	this.region = region;
}
public Regions(int regionid, String region) {
	super();
	this.regionid = regionid;
	this.region = region;
}

}
