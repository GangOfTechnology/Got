package com.java.designpatterns.ri.creational.prototype.impl;

import com.java.designpatterns.ri.creational.prototype.Prototype;

/**
 * Employee Class and its properties.
 * 
 * @author Got
 * @version 1.0
 * @since 2017-5-26
 */
public class Employee implements Prototype {

	private int id;
	private String name;
	private String designation;
	private double salary;
	private String address;

	public Employee() {
		System.out.println("   Employee Records ");
		System.out.println("-------------------------");
		System.out.println("Eid" + "\t" + "Ename" + "\t" + "Edesignation" + "\t" + "Esalary" + "\t\t" + "Eaddress");
	}

	public Employee(int id, String name, String designation, double salary, String address) {
		this();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.address = address;
	}

	public void showRecord() {
		System.out.println(id + "\t" + name + "\t" + designation + "\t" + salary + "\t" + address);
	}

	@Override
	public Prototype getClone() {
		return new Employee(id, name, designation, salary, address);
	}
}