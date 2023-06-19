package com.monocept.decorator;

public class wheelaling  {
	private Icarservice wheelaling;

	public wheelaling( Icarservice wheelaling) {
		
		this.wheelaling = wheelaling;
	}
	public double getcost() {
		return 500+wheelaling.getcost();
	}
}
