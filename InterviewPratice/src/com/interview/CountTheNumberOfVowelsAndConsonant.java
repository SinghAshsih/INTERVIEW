package com.interview;

public class CountTheNumberOfVowelsAndConsonant {
	public static void main(String[] args) {
		String input = "My name is ashish  singh";
		countTheNumberOfVowelsAndConsonant(input);

	}

	private static void countTheNumberOfVowelsAndConsonant(String input) {
		// TODO Auto-generated method stub
		input = input.replaceAll(" ", "").toLowerCase();
		int vowelsCount = 0;
		int consonantCount = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o'
					|| input.charAt(i) == 'u') {
				vowelsCount++;
			} else {
				consonantCount++;

			}
		}
		System.out.println("No. of vowels is  " + vowelsCount);
		System.out.println("No. of consonsnt is  " + consonantCount);
	}
}

