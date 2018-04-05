package com.crossover.goodcoding1;

import com.crossover.goodcoding1.businness.PaymentManager;
import com.crossover.goodcoding1.model.Bill;
import com.crossover.goodcoding1.model.payment.CreditPayment;
import com.crossover.goodcoding1.model.payment.DebitPayment;
import com.crossover.goodcoding1.model.payment.MoneyPayment;

public class GoodCodingExample {
	public static void main(String[] args) {

		Bill bill = new Bill(100.f, "smartphone");
		PaymentManager paymentManager = new PaymentManager();
		paymentManager.resolvePayment(bill, new MoneyPayment());
		paymentManager.resolvePayment(bill, new CreditPayment());
		paymentManager.resolvePayment(bill, new DebitPayment());

	}

}
