package com.cts.tms.ri.creational.factory.main;

import com.cts.tms.ri.creational.factory.impl.TelevisionFactory;

/**
 * Main class of Factory Pattern.
 * 
 * @author 274664 (Ravikumar J), 323596 (Sankar S)
 * @version 1.0
 * @since 2017-5-26
 */
public class TelevisionFactoryMain {

	private TelevisionFactoryMain() {}

	public static void main(String[] args) {
		TelevisionFactory.getTelevision(TelevisionFactory.TVMODE.LED).createTelevision();
	}
}
