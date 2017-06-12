package com.cts.tms.ri.creational.singleton;

/**
 * Lazy Singleton Class which initializes the instance while calling getInstance synchronized method.
 * 
 * @author 274664 (Ravikumar J), 323596 (Sankar S)
 * @version 1.0
 * @since 2017-5-26
 */
public class ThreadSafeSingleton {

	private static ThreadSafeSingleton instance = null;

	/**
	 * A private Constructor prevents any other class from instantiating.
	 */
	private ThreadSafeSingleton() {}

	/* Static synchronized 'instance' method */
	public static synchronized ThreadSafeSingleton getInstance() {
		if (instance == null) {
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}
	
	/* Other methods protected by singleton-ness */
	public void callMe() {
		System.out.println("Method called in Thread-Safe Lazy singleton instance");
	}
}
