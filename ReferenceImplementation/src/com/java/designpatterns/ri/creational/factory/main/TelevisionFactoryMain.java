package com.java.designpatterns.ri.creational.factory.main;

import com.java.designpatterns.ri.creational.factory.impl.TelevisionFactory;

/**
 * Main class of Factory Pattern.
 * 
 * @author Got
 * @version 1.0
 * @since 2017-5-26
 */
public class TelevisionFactoryMain {

	private TelevisionFactoryMain() {}

	public static void main(String[] args) {
		TelevisionFactory.getTelevision(TelevisionFactory.TVMODE.LED).createTelevision();
	}
}
