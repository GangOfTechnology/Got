package com.java.designpatterns.ri.creational.absfactmethod.factory;

import com.java.designpatterns.ri.creational.absfactmethod.Bike;
import com.java.designpatterns.ri.creational.absfactmethod.Car;
import com.java.designpatterns.ri.creational.absfactmethod.impl.Bajaj;
import com.java.designpatterns.ri.creational.absfactmethod.impl.Hero;
import com.java.designpatterns.ri.creational.absfactmethod.impl.Yamaha;

/**
 * Bike Factory Class.
 * 
 * @author Got
 * @version 1.0
 * @since 2017-5-26
 */
public class BikeFactory extends AbstractFactory {

	@Override
	public Bike getBike(String brand) {

		if (brand == null) {
			return null;
		}
		if ("BAJAJ".equalsIgnoreCase(brand)) {
			return new Bajaj();

		} else if ("HERO".equalsIgnoreCase(brand)) {
			return new Hero();

		} else if ("YAMAHA".equalsIgnoreCase(brand)) {
			return new Yamaha();
		}

		return null;
	}

	@Override
	public Car getCar(String brand) {
		return null;
	}
}