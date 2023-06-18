package com.monocept.cars;

public class ClassFactory {
public static ICars makeCars(CatType car) {
	if(car==CatType.Maruti) {
		return new Maruti();
	}
	if(car==CatType.Mahindra) {
		return new Mahindra();
	}
	if(car==CatType.Tata) {
		return new Tata();
	}
	return null;
}
}
