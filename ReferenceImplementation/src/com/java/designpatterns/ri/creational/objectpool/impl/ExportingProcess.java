package com.java.designpatterns.ri.creational.objectpool.impl;

/**
 * Export Process class which will be added to Object Pool.
 * 
 * @author Got
 * @version 1.0
 * @since 2017-5-26
 */
public class ExportingProcess {
	private long processNo;

	public ExportingProcess(long processNo) {
		this.processNo = processNo;
		System.out.println("Object with process no. " + processNo + " was created");
	}

	public long getProcessNo() {
		return processNo;
	}
}