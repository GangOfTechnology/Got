package com.cts.tms.ri.creational.factorymethod.impl;

import com.cts.tms.ri.creational.factorymethod.EBPlan;
import com.cts.tms.ri.creational.factorymethod.Plan;

/**
 * Institutional EB Plan Class.
 * 
 * @author 274664 (Ravikumar J), 323596 (Sankar S)
 * @version 1.0
 * @since 2017-5-26
 */
public class InstitutionalPlan implements Plan {

	private EBPlan ebPlan;

	private double rate = 5.50;

	public InstitutionalPlan() {
		ebPlan = new EBPlan(rate);
	}

	@Override
	public EBPlan getPlan() {
		return ebPlan;
	}
}
