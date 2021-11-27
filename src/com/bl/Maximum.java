package com.bl;

public class Maximum {
	public static Double findMaximumNumber(Double x, Double y, Double z) {
		Double max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println("Maximum Number:" + findMaximumNumber(26.99, 16.58, 52.35));
	}
}
