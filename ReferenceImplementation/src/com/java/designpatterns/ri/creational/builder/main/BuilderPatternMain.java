package com.java.designpatterns.ri.creational.builder.main;

import com.java.designpatterns.ri.creational.builder.Car;

/**
 * Main Class of Builder Pattern.
 * 
 * @author Got
 * @version 1.0
 * @since 2017-5-26
 */
public class BuilderPatternMain {
	
	private BuilderPatternMain() {}

	public static void main(String[] args) {
		//Using builder to get the object in a single line of code and without any inconsistent state or arguments management issues		
		new Car.CarBuilder("Toyota", "2.0").setAutoTransmissionEnabled(true).setLuxuryModelEnabled(true).build();
	}
}
