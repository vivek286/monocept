package com.monocept.thread;

public class Mythread extends Thread {
private String name;
public Mythread(String name) {
	super(name);
	start();
	
}
public void run() {
	
	for(int i=1;i<=5;i++) {
		System.out.println(Thread.currentThread().getName()+" : "+i);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
}
}
