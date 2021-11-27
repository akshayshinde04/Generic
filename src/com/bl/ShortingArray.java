package com.bl;

public class ShortingArray <T extends Comparable<T>>{
		T [] multiple;

		public ShortingArray(T [] multiple) {
				this.multiple = multiple;
			}

		public T maximum() {
			return ShortingArray.maximum(multiple);
		}

		public static <T extends Comparable<T>> T maximum(T []multiple) {
			final int  ZERO = 0;
			for (int i = ZERO; i < multiple.length; i++) {
				for (int j = i; j < multiple.length; j++) {
					if (multiple[i].compareTo(multiple[j]) < 0) {
						T temp = multiple[i];
						multiple[i] = multiple[j];
						multiple[j] = temp;
					}
				}
			}
			return multiple[0];
		}

		public static void main(String[] args) {
			Integer [] multiString = {84,42,35,78,55};
			int maxValue = new ShortingArray<Integer>(multiString).maximum();
			System.out.println("the maximum value of arry "+maxValue);
		}
}
