package com.interview;

public class NearestSum {
	public static void main(String[] args) {
		int[] a1 = { 12, 13, 5, 3 };
		int[] a2 = { 13, 13, 30, 24 };
		int x = 32;

		int minDiff = Integer.MAX_VALUE;
		int closestSum = 0;
		int num1 = 0, num2 = 0;

		for (int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a2.length; j++) {
				int sum = a1[i] + a2[j];
				int diff = Math.abs(x - sum);

				if (diff < minDiff) {
					minDiff = diff;
					closestSum = sum;
					num1 = a1[i];
					num2 = a2[j];
				}
			}
		}

		System.out.println("Closest pair to " + x + ": " + num1 + " and " + num2);
		System.out.println("Their sum: " + closestSum);
	}
}

class AbsExample1 {
	public static void main(String args[]) {
		int x = 78;
		int y = -48;
		// print the absolute value of int type
		System.out.println(Math.abs(x));
		System.out.println(Math.abs(y));
		System.out.println(Math.abs(Integer.MIN_VALUE));
	}
}