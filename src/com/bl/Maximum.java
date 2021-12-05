package com.bl;

import java.util.Arrays;

public class Maximum<T extends Comparable<T>> {
	public static void main(String[] args) {
		Integer[] intArr = { 19, 1339, 999, 995 };
		Float[] floatArr = { 15.55f, 14.65f, 15.22f };
		String[] strArr = { "RAMESH", "Ramesh", "ramesh" };

		// call generic method
		findMax(intArr);
		findMax(floatArr);
		findMax(strArr);
	}

	// method to find max value
	public static <E extends Comparable<E>> void findMax(E[] arr) {

		E maximum = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (maximum.compareTo(arr[i]) < 0) {
				maximum = arr[i];
			}
		}
		printMax(maximum);
	}

	// print method to print the obtained max value
	public static <E> void printMax(E max) {
		System.out.println("Among the three the maximum is " + max);
	}
}
	