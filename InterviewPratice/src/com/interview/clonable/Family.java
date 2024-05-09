package com.interview.clonable;

public class Family implements Cloneable {
	int familyId;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
