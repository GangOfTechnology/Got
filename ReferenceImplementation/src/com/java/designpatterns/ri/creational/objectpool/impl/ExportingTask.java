package com.java.designpatterns.ri.creational.objectpool.impl;

import com.java.designpatterns.ri.creational.objectpool.ObjectPool;

/**
 * ExportingTask class which will use ExportingProcess from ObjectPool.
 * 
 * @author Got
 * @version 1.0
 * @since 2017-5-26
 */
public class ExportingTask implements Runnable {
	private ObjectPool<ExportingProcess> pool;
	private int threadNo;

	public ExportingTask(ObjectPool<ExportingProcess> pool, int threadNo) {
		this.pool = pool;
		this.threadNo = threadNo;
	}

	public void run() {
		// get an object from the pool
		ExportingProcess exportingProcess = pool.borrowObject();
		System.out.println("Thread " + threadNo + ": Object with process no. " + exportingProcess.getProcessNo() + " was borrowed");

		// return ExportingProcess instance back to the pool
		pool.returnObject(exportingProcess);
		System.out.println("Thread " + threadNo + ": Object with process no. " + exportingProcess.getProcessNo() + " was returned");
	}

}