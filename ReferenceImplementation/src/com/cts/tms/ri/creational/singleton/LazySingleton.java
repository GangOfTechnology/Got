package com.cts.tms.ri.creational.singleton;

/**
 * Lazy Singleton Class which initializes the instance while calling getInstance method.
 * 
 * @author 274664 (Ravikumar J), 323596 (Sankar S)
 * @version 1.0
 * @since 2017-5-26
 */
public class LazySingleton {

	private static LazySingleton instance = null;

	/**
	 * A private Constructor prevents any other class from instantiating.
	 */
	private LazySingleton() {}

	/* Static 'instance' method */
	public static LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
	
	/* Other methods protected by singleton-ness */
	public void callMe() {
		System.out.println("Method called in Lazy singleton instance");
	}
}
