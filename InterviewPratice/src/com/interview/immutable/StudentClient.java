package com.interview.immutable;

public class StudentClient {
	public static void main(String[] args) {
		Address address = new Address(101, "Devolia Resort", "23N");
		Student student = new Student(1, "Ashish", "6026-4392-1718", address);
		System.out.println(student);
		address.id = 12;
		Address address2 = new Address(address.id = 2, "Hotel Shree HAri", address.houseNo="22");
		Student student2 = new Student(2, "Ashish Singh", "1111-2222-5343", address2);
		System.out.println(student2);
		System.out.println(student);

	}
}
