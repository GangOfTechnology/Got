package com.cts.tms.ri.creational.factory.impl;

import com.cts.tms.ri.creational.factory.Television;

/**
 * TelevisionFactory Class.
 * 
 * @author 274664 (Ravikumar J), 323596 (Sankar S)
 * @version 1.0
 * @since 2017-5-26
 */
public class TelevisionFactory {

	public enum TVMODE {
		COLOR, LED, LCD, THREEDIM
	};

	public static Television getTelevision(TVMODE mode) {
		if (mode.equals(TVMODE.LED)) {
			return new Television() {
				@Override
				public void createTelevision() {
					System.out.println("LED TV");
				}
			};
		}
		return null;
	}
}
