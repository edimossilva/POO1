package com.crossover.goodcoding1.model.payment;

import com.crossover.goodcoding1.model.Bill;

public class DebitPayment implements Payment {
	private final Float debitTax = 1.1f;

	public void pay(Bill bill) {
		String paymentInfo = "Paying " + bill.getName();
		String moneyInfo = " debit with value ";
		Float finalValue = bill.getValue() * debitTax;
		System.out.println(paymentInfo + moneyInfo + finalValue);
	}

}
