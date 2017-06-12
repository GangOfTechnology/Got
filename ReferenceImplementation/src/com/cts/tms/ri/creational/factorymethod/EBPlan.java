package com.cts.tms.ri.creational.factorymethod;

/**
 * EB Plan Class.
 * 
 * @author 274664 (Ravikumar J), 323596 (Sankar S)
 * @version 1.0
 * @since 2017-5-26
 */
public class EBPlan {
	
	protected double rate;
	
	public EBPlan(double rate) {
		this.rate = rate;
	}

	public void getBill(int units) {
		System.out.println(units * rate);
	}
}