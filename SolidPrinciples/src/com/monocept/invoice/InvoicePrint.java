package com.monocept.invoice;

public class InvoicePrint {
	public static String print(Invoice a) {
		return "Invoice \ninvoiceid=" + a.getInvoiceid() + ", amount=" + a.getAmount() + ", tax=" + a.getTax() + ", name=" + a.getName()+ "";
	}

}
