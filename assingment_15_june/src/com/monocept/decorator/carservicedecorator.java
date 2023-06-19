package com.monocept.decorator;

public class carservicedecorator implements Icarservice {
private Icarservice carobj;

public carservicedecorator(Icarservice carobj) {
	super();
	this.carobj = carobj;
}
public double getcost() {
	return carobj.getcost();
}

}
