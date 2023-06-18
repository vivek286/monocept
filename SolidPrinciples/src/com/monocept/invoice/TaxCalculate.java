package com.monocept.invoice;

public class TaxCalculate {
public static void Calculate(Invoice a) {
	a.setTax((int)((0.08*a.getAmount())));
}
}
