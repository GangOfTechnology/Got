package com.java.designpatterns.ri.creational.absfactmethod.impl;

import com.java.designpatterns.ri.creational.absfactmethod.Car;

/**
 * Honda Class of type Car.
 * 
 * @author Got
 * @version 1.0
 * @since 2017-5-26
 */
public class Honda implements Car {

	@Override
	public void makeEngine() {
		System.out.println("Honda Car Make Engine method.");
	}
}