package com.java.designpatterns.ri.creational.absfactmethod.factory;

import com.java.designpatterns.ri.creational.absfactmethod.Bike;
import com.java.designpatterns.ri.creational.absfactmethod.Car;

/**
 * Abstract Class.
 * 
 * @author Got
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