package com.recursions;

public class Recursions {
	static int i = 0;

	public static void main(String[] args) {

//		System.out.println(factorial(5));

//		drawRuler(3,4);
		
//		System.out.println(maxElementsInArray(new int [] {1,3,6,4,5} , 5 ) );

//		System.out.println(binarySearch(new int[] {1,2,3,4,5,6,8,9,10,11}, 85,0,9 ));

//		int[] arr = new int[] { 5, 2, 1, 2 };
		
//		System.out.println(sumArray(arr, 4));
		
		System.out.println(power(2, 4));

//		System.out.println(binarySum(arr,0,3));
		
		
		
		
	}
	

	
	
	public static double harmonic(double n) {
		 if(n == 0) return 0;
		return 1/n + harmonic(n-1);
	}

	public static double power(double x, int n) {
		if (n == 0)
			return 1;
		else {
			double partial = power(x, n / 2);
			double result = partial * partial;
			if (n % 2 == 1)
				result *= x;
			return result;
		}
	}

	public static int binarySum(int[] data, int low, int high) {
		if (low > high) // zero elements in subarray
			return 0;
		else if (low == high) // one element in subarray
			return data[low];
		else {
			int mid = (low + high) / 2;
			return binarySum(data, low, mid) + binarySum(data, mid + 1, high);
		}
	}

	public static double powe(double x, int n) {
		if (n == 0)
			return 1;
		return x * power(x, n - 1);
	}

	public static int sumArray(int[] arr, int n) {

		if (n == 0)
			return 0;
		return arr[n - 1] + sumArray(arr, n - 1);
	}

	public static int binarySearch(int[] arr, int target, int low, int high) {
		if (low > high)
			return -1;

		int mid = (low + high) / 2;
		if (arr[mid] == target)
			return mid;

		else if (arr[mid] > target) {
			return binarySearch(arr, target, low, mid - 1);
		} else {
			return binarySearch(arr, target, mid + 1, high);
		}

	}

	public static int maxElementsInArray(int[] A, int n) {

		if (n == 1)
			return A[0];

		return Math.max(A[n - 1], maxElementsInArray(A, n - 1));

	}

	public static int factorial(int n) throws IllegalArgumentException {
		if (n < 0)
			throw new IllegalArgumentException();
		else if (n == 0)
			return 1;
		else
			return n * factorial(n - 1);
	}

	public static void drawRuler(int nInches, int majorLength) {
		drawLine(majorLength, 0);
		for (int j = 1; j <= nInches; j++) {
			drawInterval(majorLength - 1);
			drawLine(majorLength, j);
		}
	}

	private static void drawInterval(int centralLength) {
		if (centralLength >= 1) {
			drawInterval(centralLength - 1);
			drawLine(centralLength);
			drawInterval(centralLength - 1);
		}
	}

	private static void drawLine(int tickLength, int tickLabel) {
		for (int j = 0; j < tickLength; j++)
			System.out.print("-");
		if (tickLabel >= 0)
			System.out.print(" " + tickLabel);
		System.out.print("\n");
	}

	private static void drawLine(int tickLength) {
		drawLine(tickLength, -1);
	}
}
