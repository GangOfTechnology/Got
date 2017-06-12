package com.java.designpatterns.ri.creational.singleton.main;

import com.java.designpatterns.ri.creational.singleton.EagerSingleton;
import com.java.designpatterns.ri.creational.singleton.LazySingleton;
import com.java.designpatterns.ri.creational.singleton.ThreadSafeSingleton;

/**
 * Main Class of Singleton Pattern.
 * 
 * @author Got
 * @version 1.0
 * @since 2017-5-26
 */
public class SingletonMain {

	private SingletonMain() {}
	
	public static void main(String[] args) {
		EagerSingleton eagerSingleton = EagerSingleton.getInstance();
		eagerSingleton.callMe();
		
		LazySingleton lazySingleton = LazySingleton.getInstance();
		lazySingleton.callMe();
		
		ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();
		threadSafeSingleton.callMe();
	}
}
