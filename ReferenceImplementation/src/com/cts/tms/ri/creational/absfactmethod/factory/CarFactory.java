package com.cts.tms.ri.creational.absfactmethod.factory;

import com.cts.tms.ri.creational.absfactmethod.Bike;
import com.cts.tms.ri.creational.absfactmethod.Car;
import com.cts.tms.ri.creational.absfactmethod.impl.Ford;
import com.cts.tms.ri.creational.absfactmethod.impl.Honda;
import com.cts.tms.ri.creational.absfactmethod.impl.Toyota;

/**
 * Car Factory Class.
 * 
 * @author 274664 (Ravikumar J), 323596 (Sankar S)
 * @version 1.0
 * @since 2017-5-26
 */
public class CarFactory extends AbstractFactory {

	@Override
	public Bike getBike(String brand) {
		return null;
	}

	@Override
	public Car getCar(String brand) {

		if (brand == null) {
			return null;
		}

		if ("FORD".equalsIgnoreCase(brand)) {
			return new Ford();

		} else if ("HONDA".equalsIgnoreCase(brand)) {
			return new Honda();

		} else if ("TOYOTA".equalsIgnoreCase(brand)) {
			return new Toyota();
		}

		return null;
	}
}