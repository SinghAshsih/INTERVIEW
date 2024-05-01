package com.interview.clonable;

public class EmployeeClient {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee employee = new Employee();
		employee.id = 23;
		System.out.println("Employee 1  " + employee.id);
		System.out.println("---------------------------");
		Employee employee2 = (Employee) employee.clone();
		System.out.println("Employee 2  " + employee2.id);
		System.out.println("============================");
		employee2.id = 200;
		System.out.println("Employee 1  " + employee.id);
		System.out.println("Employee 2  " + employee2.id);
	}
}
