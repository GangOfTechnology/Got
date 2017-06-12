package com.cts.tms.ri.creational.absfactmethod.factory;

import com.cts.tms.ri.creational.absfactmethod.Bike;
import com.cts.tms.ri.creational.absfactmethod.Car;
import com.cts.tms.ri.creational.absfactmethod.impl.Bajaj;
import com.cts.tms.ri.creational.absfactmethod.impl.Hero;
import com.cts.tms.ri.creational.absfactmethod.impl.Yamaha;

/**
 * Bike Factory Class.
 * 
 * @author 274664 (Ravikumar J), 323596 (Sankar S)
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