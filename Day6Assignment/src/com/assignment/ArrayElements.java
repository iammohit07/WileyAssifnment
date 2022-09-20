package com.assignment;

public class ArrayElements {
	public static boolean isFirstAndLastElementSame(int[] input) {
		if (input.length < 5) {
			System.out.println("Array length shorter than 5 !!");
			System.exit(0);
		} else {
			if (input[0] == input[input.length - 1]) {
				return true;
			}
		}
		return false;
	}
}
