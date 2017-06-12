package com.cts.tms.ri.creational.absfactmethod.factory;

/**
 * Factory Class which request BikeFactory / CarFactory based on the choice.
 * 
 * @author 274664 (Ravikumar J), 323596 (Sankar S)
 * @version 1.0
 * @since 2017-5-26
 */
public class FactoryProducer {
	
	private FactoryProducer() {}
	
	public static AbstractFactory getFactory(String choice) {

		if ("BIKE".equalsIgnoreCase(choice)) {
			return new BikeFactory();

		} else if ("CAR".equalsIgnoreCase(choice)) {
			return new CarFactory();
		}

		return null;
	}
}