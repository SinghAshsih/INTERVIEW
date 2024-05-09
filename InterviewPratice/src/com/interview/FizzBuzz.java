package com.interview;

public class FizzBuzz {
//	Write a program that prints the numbers from 1 to 100. But for multiples of 5, print “Fizz” instead of the number, and 
//	for multiples of 7, print “Buzz“. For numbers that are multiples of both 5 and 7, print “FizzBuzz.”

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0) {
				System.out.println("Fizz   " + i);
			} else if (i % 7 == 0) {
				System.out.println("Buzz   " + i);
			} else if (i % 35 == 0) {
				System.out.println("FizzBuzz  " + i);
			} else {
				System.out.println(i);
			}
		}

	}

}
