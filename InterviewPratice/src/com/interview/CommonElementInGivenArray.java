package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonElementInGivenArray {
	public static void main(String[] args) {
		Integer[] i1 = { 1, 2, 3, 9, 8, 7 };
		Integer[] i2 = { 4, 1, 2, 10, 15, 7 };
		Integer[] i3 = { 5, 1, 2, 4, 10 };

		List<Integer> list1 = Arrays.asList(i1);
		List<Integer> list2 = Arrays.asList(i2);
		List<Integer> list3 = Arrays.asList(i3);

		Set<Integer> set = new HashSet<>();
		set.addAll(list1);
		set.addAll(list2);
		set.addAll(list3);

		List<Integer> finaList = new ArrayList<>();
		for (Integer i : set) {
			if (list1.contains(i) && list2.contains(i) || list2.contains(i) && list3.contains(i)
					|| list3.contains(i) && list1.contains(i))
				finaList.add(i);
		}
		System.out.println(finaList);

	}
}
