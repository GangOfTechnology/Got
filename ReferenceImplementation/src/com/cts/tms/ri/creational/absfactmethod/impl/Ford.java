package com.cts.tms.ri.creational.absfactmethod.impl;

import com.cts.tms.ri.creational.absfactmethod.Car;

/**
 * Ford Class of type Car.
 * 
 * @author 274664 (Ravikumar J), 323596 (Sankar S)
 * @version 1.0
 * @since 2017-5-26
 */
public class Ford implements Car {

	@Override
	public void makeEngine() {
		System.out.println("Ford Car Make Engine method.");
	}
}