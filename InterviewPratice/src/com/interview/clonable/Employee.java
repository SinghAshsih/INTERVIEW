package com.interview.clonable;

public class Employee implements Cloneable {
	int id;
	Family family;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Employee employee = (Employee) super.clone();
		employee.family = (Family) family.clone();
		return employee;
	}
}
