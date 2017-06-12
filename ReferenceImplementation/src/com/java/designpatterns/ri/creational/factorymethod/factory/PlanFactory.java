package com.java.designpatterns.ri.creational.factorymethod.factory;

import com.java.designpatterns.ri.creational.factorymethod.Plan;
import com.java.designpatterns.ri.creational.factorymethod.impl.CommercialPlan;
import com.java.designpatterns.ri.creational.factorymethod.impl.DomesticPlan;
import com.java.designpatterns.ri.creational.factorymethod.impl.InstitutionalPlan;

/**
 * Plan Factory Class.
 * 
 * @author Got
 * @version 1.0
 * @since 2017-5-26
 */
public class PlanFactory {

	// use getPlan method to get object of type Plan
	public Plan getPlanType(String planType) {
		if (planType == null) {
			return null;
		}
		if (planType.equalsIgnoreCase("DOMESTICPLAN")) {
			return new DomesticPlan();
		} else if (planType.equalsIgnoreCase("COMMERCIALPLAN")) {
			return new CommercialPlan();
		} else if (planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
			return new InstitutionalPlan();
		}
		return null;
	}
}