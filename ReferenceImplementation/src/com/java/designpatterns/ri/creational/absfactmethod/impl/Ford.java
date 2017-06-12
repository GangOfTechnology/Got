package com.java.designpatterns.ri.creational.absfactmethod.impl;

import com.java.designpatterns.ri.creational.absfactmethod.Car;

/**
 * Ford Class of type Car.
 * 
 * @author Got
 * @version 1.0
 * @since 2017-5-26
 */
public class Ford implements Car {

	@Override
	public void makeEngine() {
		System.out.println("Ford Car Make Engine method.");
	}
}