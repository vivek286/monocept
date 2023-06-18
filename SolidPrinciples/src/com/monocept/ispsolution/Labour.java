package com.monocept.ispsolution;

public class Labour implements IWorker {

	@Override
	public void eat() {
		System.out.println("Labour is eating");
	}
	public void drink() {
		System.out.println("Labour is drinking");
	}
	public void startWork() {
		System.out.println("Labour is Working");
	}
	public void stopWork() {
		System.out.println("Labour is Stop");
	}
	
}
