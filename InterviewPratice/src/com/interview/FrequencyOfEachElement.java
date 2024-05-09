package com.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEachElement {
	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 2, 4, 5, 6, 7, 8, 1, 2, 3, 1, 2, 8, 4, 5, 6 };
		frequencyOfEachElement1(num);
		System.out.println("--------------------------------------------------");
		frequencyOfEachElement2(num);
	}

	private static void frequencyOfEachElement1(int[] num) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : num) {
			if (!map.containsKey(i)) {
				map.put(i, 1);
			} else {
				map.put(i, map.get(i) + 1);
			}

		}
		System.out.println("Numbers" + "   " + "Frequency");
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println("   " + entry.getKey() + "   ->   " + entry.getValue());
		}

	}

	private static void frequencyOfEachElement2(int[] num) {
		// TODO Auto-generated method stub
		int[] array = Arrays.stream(num).sorted().distinct().toArray();
		System.out.println("Numbers" + "   " + "Frequency");
		for (int i = 0; i < array.length; i++) {
			int count = 0;
			for (int j = 0; j < num.length; j++) {
				if (array[i] == num[j]) {
					count++;
				}
			}
			System.out.println("  " + array[i] + "         " + count);
		}

	}
}
