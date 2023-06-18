package com.monocept.cars;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassFactory cf=new ClassFactory();
		ICars car=cf.makeCars(CatType.Maruti);
		car.start();
		car.stop();
	}

}
