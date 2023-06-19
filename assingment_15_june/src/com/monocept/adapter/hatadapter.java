package com.monocept.adapter;

public class hatadapter implements items {
private hat h1;

public hatadapter(hat h1) {
	super();
	this.h1 = h1;
}
@Override
public String getname() {
	return h1.getShortname()+h1.getLongname();
}
public double itemprice() {
	return h1.getBasicprice()+h1.getTax();
}


}
