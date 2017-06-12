package com.cts.tms.ri.creational.absfactmethod.impl;

import com.cts.tms.ri.creational.absfactmethod.Bike;

/**
 * Yamaha Class of type Bike.
 * 
 * @author 274664 (Ravikumar J), 323596 (Sankar S)
 * @version 1.0
 * @since 2017-5-26
 */
public class Yamaha implements Bike {

	@Override
	public void makeEngine() {
		System.out.println("Yamaha Bike Make Engine method.");
	}
}