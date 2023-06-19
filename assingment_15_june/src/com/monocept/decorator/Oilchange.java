package com.monocept.decorator;

public class Oilchange extends carservicedecorator {
private Icarservice oilchange;

public Oilchange(Icarservice carobj, Icarservice oilchange) {
	super(carobj);
	this.oilchange = oilchange;
}
public double getcost() {
	return 500+oilchange.getcost();
}
}
