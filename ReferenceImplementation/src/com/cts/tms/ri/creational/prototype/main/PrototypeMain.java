package com.cts.tms.ri.creational.prototype.main;

import java.io.IOException;

import com.cts.tms.ri.creational.prototype.impl.Employee;

/**
 * Main Class of Prototype Pattern.
 * 
 * @author 274664 (Ravikumar J), 323596 (Sankar S)
 * @version 1.0
 * @since 2017-5-26
 */
public class PrototypeMain {
	
	private PrototypeMain() {}
	
	public static void main(String[] args) throws IOException {

		int eid = 123456;
		String ename = "Mayer";
		String edesignation = "Developer";
		String eaddress = "123, S.W.Avenue";
		double esalary = 54321.76;
		Employee e1 = new Employee(eid, ename, edesignation, esalary, eaddress);
		e1.showRecord();
		System.out.println("\n");
		Employee e2 = (Employee) e1.getClone();
		e2.showRecord();
	}
}
