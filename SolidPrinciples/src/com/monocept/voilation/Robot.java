package com.monocept.voilation;

public class Robot implements IWorker {

	@Override
	public void eat() {
		System.out.println("Robot is eating");
	}
	public void drink() {
		System.out.println("Robot is drinking");
	}
	public void startWork() {
		System.out.println("Robot is Working");
	}
	public void stopWork() {
		System.out.println("Robot is Stop");
	}
}
