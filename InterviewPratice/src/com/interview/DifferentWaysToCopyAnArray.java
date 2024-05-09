package com.interview;

import java.util.Arrays;

public class DifferentWaysToCopyAnArray {
	public static void main(String[] args) {
		int[] arr = { 12, 56, 34, 49, 60 };
		method1(arr);
		System.out.println("---------------------------------------------------------------------");
		method2(arr);
		System.out.println("---------------------------------------------------------------------");
		method3(arr);
		System.out.println("---------------------------------------------------------------------");
		method4(arr);
		System.out.println("---------------------------------------------------------------------");
		method5(arr);
	}

	private static void method1(int[] arr) {
		// TODO Auto-generated method stub
		int[] newArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		System.out.println("OLD ARRAY  " + Arrays.toString(arr));
		System.out.println("NEW ARRAY  " + Arrays.toString(newArr));
	}

	private static void method2(int[] arr) {
		// TODO Auto-generated method stub
		int[] newArr = arr.clone();
		System.out.println("OLD ARRAY  " + Arrays.toString(arr));
		System.out.println("NEW ARRAY  " + Arrays.toString(newArr));

	}

	private static void method3(int[] arr) {
		// TODO Auto-generated method stub
		int[] newArr = new int[arr.length];
		System.arraycopy(arr, 0, newArr, 0, arr.length);
		System.out.println("OLD ARRAY  " + Arrays.toString(arr));
		System.out.println("NEW ARRAY  " + Arrays.toString(newArr));
	}

	private static void method4(int[] arr) {
		// TODO Auto-generated method stub
		// int[] newArr=new int[arr.length];
		int[] newArr = Arrays.copyOf(arr, arr.length);

		System.out.println("OLD ARRAY  " + Arrays.toString(arr));
		System.out.println("NEW ARRAY  " + Arrays.toString(newArr));
		System.out.println("---------------------------------------------------------------------");
		int[] copyOfRange = Arrays.copyOfRange(arr, 0, arr.length);
		System.out.println("OLD ARRAY  " + Arrays.toString(arr));
		System.out.println("NEW ARRAY  " + Arrays.toString(copyOfRange));
	}

	private static void method5(int[] arr) {
		// TODO Auto-generated method stub
		int[] newArr = Arrays.stream(arr).toArray();
		System.out.println("OLD ARRAY  " + Arrays.toString(arr));
		System.out.println("NEW ARRAY  " + Arrays.toString(newArr));
	}

}
