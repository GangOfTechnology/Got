package com.java.designpatterns.ri.creational.factorymethod.impl;

import com.java.designpatterns.ri.creational.factorymethod.EBPlan;
import com.java.designpatterns.ri.creational.factorymethod.Plan;

/**
 * Domestic EB Plan Class.
 * 
 * @author Got
 * @version 1.0
 * @since 2017-5-26
 */
public class DomesticPlan implements Plan {

	private EBPlan ebPlan;

	private double rate = 3.50;

	public DomesticPlan() {
		ebPlan = new EBPlan(rate);
	}

	@Override
	public EBPlan getPlan() {
		return ebPlan;
	}
}