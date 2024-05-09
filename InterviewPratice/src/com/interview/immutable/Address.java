package com.interview.immutable;

public class Address {
	int id;
	String landmark;
	String houseNo;
	public Address(int id, String landmark, String houseNo) {
		super();
		this.id = id;
		this.landmark = landmark;
		this.houseNo = houseNo;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", landmark=" + landmark + ", houseNo=" + houseNo + "]";
	}
}
