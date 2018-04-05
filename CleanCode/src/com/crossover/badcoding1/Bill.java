package com.crossover.badcoding1;

public class Bill {
	private Float value;
	private String name;

	public Bill(Float value) {
	}

	public Bill(float value, String name) {
		this.value = value;
		this.name = name;
	}

	public void pay(String type) {
		if (type.equals("cash")) {
			payInCash();
		} else if (type.equals("debit")) {
			payInDedit();
		} else if (type.equals("credit")) {
			payInCredit();
		} else {
			throw new IllegalAccessError("The choosen payment type doesn't exists");
		}
	}

	public void payInCash() {
		System.out.println(" Paying " + getName() + "in cash value = " + getValue());
	}

	public void payInDedit() {
		System.out.println(" Paying " + getName() + "in debit value = " + getValue() * 1.1);
	}

	public void payInCredit() {
		System.out.println(" Paying " + getName() + "in credit value = " + getValue() * 1.2);
	}

	private String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getValue() {
		return value;
	}

	public void setValue(Float value) {
		this.value = value;
	}
}
