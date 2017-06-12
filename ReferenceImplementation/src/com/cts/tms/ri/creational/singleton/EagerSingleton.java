package com.cts.tms.ri.creational.singleton;

/**
 * Eager Singleton Class which initializes the instance on load.
 * 
 * @author 274664 (Ravikumar J), 323596 (Sankar S)
 * @version 1.0
 * @since 2017-5-26
 */
public class EagerSingleton {

	private static EagerSingleton eagerSingleton = new EagerSingleton();

	/**
	 * A private Constructor prevents any other class from instantiating.
	 */
	private EagerSingleton() {
	}

	/* Static 'instance' method */
	public static EagerSingleton getInstance() {
		return eagerSingleton;
	}

	/* Other methods protected by singleton-ness */
	public void callMe() {
		System.out.println("Method called in Eager singleton instance");
	}
}
