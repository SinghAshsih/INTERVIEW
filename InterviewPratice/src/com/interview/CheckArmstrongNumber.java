package com.interview;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckArmstrongNumber {
	public static void main(String[] args) {
		System.out.println("Enter the number ");
		Scanner scanner = new Scanner(System.in);
		try {
			int num = scanner.nextInt();
			isArmstrong(num);
		} catch (InputMismatchException p) {
			System.out.println("Enter only integers ");
		} finally {
			scanner.close();
		}

	}

	private static void isArmstrong(int num) {
		num = Math.abs(num);
		int temp = num;
		int sum = 0;
		while (temp > 0) {
			int lastDigit = temp % 10;
			sum = (int) (sum + Math.pow(lastDigit, 3));
			temp /= 10;
		}
		if (sum == num) {
			System.out.println("This is armstrong number ");
		} else {
			System.out.println("This is not armstrong number");
		}
	}
}
