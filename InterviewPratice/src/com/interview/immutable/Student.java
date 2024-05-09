package com.interview.immutable;

public final class Student {
	private final int id;
	private final String name;
	private final String aaddhar;
	private final Address address;

	public Student(int id, String name, String aaddhar, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.aaddhar = aaddhar;
		// Deep Copy
		Address address2 = new Address(address.id, address.landmark, address.houseNo);
		this.address = address2;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAaddhar() {
		return aaddhar;
	}

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", aaddhar=" + aaddhar + ", address=" + address + "]";
	}

}
