package com.java.designpatterns.ri.creational.factorymethod.impl;

import com.java.designpatterns.ri.creational.factorymethod.EBPlan;
import com.java.designpatterns.ri.creational.factorymethod.Plan;

/**
 * Commercial EB Plan Class.
 * 
 * @author Got
 * @version 1.0
 * @since 2017-5-26
 */
public class CommercialPlan implements Plan {

	private EBPlan ebPlan;
	
	private double rate = 7.50;
	
	public CommercialPlan() {
		ebPlan = new EBPlan(rate);
	}
	
	@Override
	public EBPlan getPlan() {
		return ebPlan;
	}
	
}