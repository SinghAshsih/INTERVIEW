package com.interview.clonable;

public class TestStudent {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student student = new Student();
		student.rollNo = 8;
		Address address = new Address();
		address.addressId = 123;
		student.address = address;
		Student student2 = student;
		System.out.println(student2.rollNo);
		System.out.println(student.rollNo);

		student2.rollNo = 9;
		System.out.println(student2.rollNo);
		System.out.println(student.rollNo);

		// using clone method
		Student student3 = (Student) student.clone();
		System.out.println(student3.rollNo);
		student3.rollNo = 44;
		student3.address.addressId=124;
		System.out.println(student3.rollNo);
		System.out.println(student2.rollNo);
		System.out.println(student.rollNo);
		System.out.println("-----------------------");
		System.out.println(student.address.addressId);
		System.out.println(student2.address.addressId);
		System.out.println(student3.address.addressId);
	}
}
