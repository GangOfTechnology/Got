package com.cts.tms.ri.creational.absfactmethod.factory;

import com.cts.tms.ri.creational.absfactmethod.Car;
import com.cts.tms.ri.creational.absfactmethod.Bike;

/**
 * Abstract Class.
 * 
 * @author 274664 (Ravikumar J), 323596 (Sankar S)
 * @version 1.0
 * @since 2017-5-26
 */
public abstract class AbstractFactory {
	
	public String classType = "Abstract Class";
	
	public abstract Car getCar(String brand);

	public abstract Bike getBike(String brand);
	
	public void display(){
		System.out.println(classType);
	}
}