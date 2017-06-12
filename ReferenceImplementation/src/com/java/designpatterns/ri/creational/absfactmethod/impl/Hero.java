package com.java.designpatterns.ri.creational.absfactmethod.impl;

import com.java.designpatterns.ri.creational.absfactmethod.Bike;

/**
 * Hero Class of type Bike.
 * 
 * @author Got
 * @version 1.0
 * @since 2017-5-26
 */
public class Hero implements Bike {

	@Override
	public void makeEngine() {
		System.out.println("Hero Bike Make Engine method.");
	}
}