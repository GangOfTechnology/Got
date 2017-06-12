package com.java.designpatterns.ri.creational.absfactmethod.impl;

import com.java.designpatterns.ri.creational.absfactmethod.Car;

/**
 * Toyota Class of type Car.
 * 
 * @author Got
 * @version 1.0
 * @since 2017-5-26
 */
public class Toyota implements Car {

	@Override
	public void makeEngine() {
		System.out.println("Toyota Car Make Engine method.");
	}
}