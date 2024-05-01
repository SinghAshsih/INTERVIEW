package com.interview.clonable;

public class Employee implements Cloneable {
	int id;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
