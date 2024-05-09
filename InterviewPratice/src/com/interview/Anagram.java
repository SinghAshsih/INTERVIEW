package com.interview;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter the 1st String :");
			String input1 = scanner.nextLine();
			System.out.println("Enter the 2nd String :");
			String input2 = scanner.nextLine();
			isAnagram(input1, input2);
		} finally {
			scanner.close();
		}
	}

	private static void isAnagram(String input1, String input2) {
		// TODO Auto-generated method stub
		input1 = input1.replaceAll("\\s", "");
		input2 = input2.replaceAll("\\s", "");
		char[] ch1 = input1.toLowerCase().toCharArray();
		char[] ch2 = input1.toLowerCase().toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if (input1.length() != input2.length()) {
			System.out.println("Not in anagram");
		} else {
			boolean result = Arrays.equals(ch1, ch2);
			if (result == true) {
				System.out.println("Yes it is in anagram");
			} else {
				System.out.println("Not in anagram");
			}
		}

	}
}
