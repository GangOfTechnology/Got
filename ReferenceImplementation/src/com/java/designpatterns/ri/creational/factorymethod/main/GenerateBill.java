package com.java.designpatterns.ri.creational.factorymethod.main;

import java.io.IOException;

import com.java.designpatterns.ri.creational.factorymethod.Plan;
import com.java.designpatterns.ri.creational.factorymethod.factory.PlanFactory;

/**
 * Main class of Factory Method Pattern.
 * 
 * @author Got
 * @version 1.0
 * @since 2017-5-26
 */
public class GenerateBill {
	public static void main(String args[]) throws IOException {
		
		PlanFactory planFactory = new PlanFactory();

		Plan plan = planFactory.getPlanType("DOMESTICPLAN");
		System.out.print("Bill amount for DOMESTICPLAN of  100 units is: ");
		plan.getPlan().getBill(100);
		
		plan = planFactory.getPlanType("COMMERCIALPLAN");
		System.out.print("Bill amount for COMMERCIALPLAN of  100 units is: ");
		plan.getPlan().getBill(100);
		
		plan = planFactory.getPlanType("INSTITUTIONALPLAN");
		System.out.print("Bill amount for INSTITUTIONALPLAN of  100 units is: ");
		plan.getPlan().getBill(100);
	}
}