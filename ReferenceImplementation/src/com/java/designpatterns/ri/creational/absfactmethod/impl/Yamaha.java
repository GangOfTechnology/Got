package com.java.designpatterns.ri.creational.absfactmethod.impl;

import com.java.designpatterns.ri.creational.absfactmethod.Bike;

/**
 * Yamaha Class of type Bike.
 * 
 * @author Got
 * @version 1.0
 * @since 2017-5-26
 */
public class Yamaha implements Bike {

	@Override
	public void makeEngine() {
		System.out.println("Yamaha Bike Make Engine method.");
	}
}