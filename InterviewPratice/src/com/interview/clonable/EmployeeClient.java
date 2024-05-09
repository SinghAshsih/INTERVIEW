package com.interview.clonable;

public class EmployeeClient {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee employee = new Employee();
		employee.id = 23;
		Family family = new Family();
		family.familyId = 100;
		employee.family = family;
		System.out.println("Employee 1  " + employee.id + "  FamlilyID  " + employee.family.familyId);
		System.out.println("---------------------------");
		Employee employee2 = (Employee) employee.clone();
		System.out.println("Employee 2  " + employee2.id + "  FamlilyID  " + employee2.family.familyId);
		System.out.println("============================");
		employee2.id = 200;
		employee2.family.familyId = 101;
		System.out.println("Employee 1  " + employee.id + "  FamlilyID  " + employee.family.familyId);
		System.out.println("Employee 2  " + employee2.id + "  FamlilyID  " + employee2.family.familyId);

	}
}
