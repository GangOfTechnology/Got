package com.java.designpatterns.ri.creational.absfactmethod.main;

import com.java.designpatterns.ri.creational.absfactmethod.Bike;
import com.java.designpatterns.ri.creational.absfactmethod.Car;
import com.java.designpatterns.ri.creational.absfactmethod.factory.AbstractFactory;
import com.java.designpatterns.ri.creational.absfactmethod.factory.FactoryProducer;

/**
 * Main Class of Abstract Factory Method Pattern.
 * 
 * @author Got
 * @version 1.0
 * @since 2017-5-26
 */
public class AbstractFactoryMain {

	private AbstractFactoryMain() {
	}

	public static void main(String[] args) {

		// Bike Factory Instance
		AbstractFactory bikeFactory = FactoryProducer.getFactory("BIKE");

		// get Bike of Brand Bajaj
		Bike bajajBike = bikeFactory.getBike("BAJAJ");

		// call makeEngine method of Bike Bajaj
		bajajBike.makeEngine();

		// get Bike of Brand Hero
		Bike heroBike = bikeFactory.getBike("HERO");

		// call makeEngine method of Bike Hero
		heroBike.makeEngine();

		// get Bike of Brand Yamaha
		Bike yamahaBike = bikeFactory.getBike("YAMAHA");

		// call makeEngine method of Bike Yamaha
		yamahaBike.makeEngine();

		// Car Factory Instance
		AbstractFactory colorFactory = FactoryProducer.getFactory("CAR");

		// get Car of Brand Ford
		Car fordCar = colorFactory.getCar("FORD");

		// call makeEngine method of Car Ford
		fordCar.makeEngine();

		// get Car of Brand Honda
		Car hondaCar = colorFactory.getCar("HONDA");

		// call makeEngine method of Car Honda
		hondaCar.makeEngine();

		// get Car of Brand Toyota
		Car toyotaCar = colorFactory.getCar("TOYOTA");

		// call makeEngine method of Car Toyota
		toyotaCar.makeEngine();
	}
}