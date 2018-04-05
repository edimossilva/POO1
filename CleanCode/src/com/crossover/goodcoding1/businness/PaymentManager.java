package com.crossover.goodcoding1.businness;

import com.crossover.goodcoding1.model.Bill;
import com.crossover.goodcoding1.model.payment.Payment;

public class PaymentManager {
	public void resolvePayment(Bill bill, Payment payment) {
		payment.pay(bill);
	}
}
