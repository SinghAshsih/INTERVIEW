package com.interview;

public class CountTheNumberOfDigits {
	public static void main(String[] args) {
		int num1 = 3432111;
		count(num1);
	}

	private static void count(int num1) {
		int count = 0;
		int temp = num1;
		while (temp > 0) {
			temp /= 10;
			count++;
		}
		System.out.println("No. of digits :  " + count);
	}
}
