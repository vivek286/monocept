package com.monocept.ispsolution;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IWorker labour=new Labour();
		labour.drink();
		labour.eat();
		labour.startWork();
		labour.stopWork();
		
		IWorker robot=new Robot();
		robot.drink();
		robot.eat();
		robot.startWork();
		robot.stopWork();
		
		
	}

}
