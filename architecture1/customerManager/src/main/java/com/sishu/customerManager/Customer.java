package com.sishu.customerManager;

import com.sishu.common.Base;

public class Customer {

	public Customer() {
		super();
	}

	public static void c1() {
		new Base().base1("Customer1 invoke");
		System.out.println(" now  in base1===");
	}
}
