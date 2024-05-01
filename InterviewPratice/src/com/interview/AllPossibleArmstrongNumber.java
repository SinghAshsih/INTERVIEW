package com.interview;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AllPossibleArmstrongNumber {
	public static void main(String[] args) {
		System.out.println("Enter the limit ");
		Scanner scanner = new Scanner(System.in);
		try {
			int limit = scanner.nextInt();
			allPossibleArmstrong(limit);

		} catch (InputMismatchException p) {
			System.out.println("Enter only positive natural number or number greater than zero");
		} finally {
			scanner.close();
		}

	}

	private static void allPossibleArmstrong(int limit) {
		if (limit < 1)
			throw new InputMismatchException();
		System.out.println("The possible armstrong from 0 to " + limit + " are as follows :");
		for (int i = 0; i <= limit; i++) {
			int temp = i;
			int sum = 0;
			while (temp > 0) {
				int lastDigit = temp % 10;
				sum = (int) (sum + Math.pow(lastDigit, 3));
				temp /= 10;
			}
			if (sum == i) {
				System.out.print(i + " ");

			}
		}

	}
}
