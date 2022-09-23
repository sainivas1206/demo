package com.demo;

import java.util.Scanner;

public class TestDemo {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String s = scan.next();
//		int k = scan.nextInt();
//		scan.close();

//		System.out.println(getSmallestAndLargest(s, k));
		twoSum(new int[] { 1, 2, 6, 8, 5, 3 }, 10);
	}

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";

		String[] arr = new String[s.length() / k + 1];

		for (int i = 0; i < s.length() / k + 1; i++) {
			arr[i] = s.substring(i, i + k);
			i *= k;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		return smallest + "\n" + largest;
	}

	public static int[] twoSum(int[] nums, int target) {
		int one = 0;
		int two = 0;
		int i, j;
		for (i = 0; i < nums.length; i++) {
			one = nums[i];
			for (j = i + 1; j < nums.length; j++) {
				two = nums[j];
				int[] outarr = new int[2];
				if (one + two == target) {
					int k=0,l = 0;
					while (k < nums.length) {
							if (nums[k] == one) {
								outarr[0] = k;
								System.out.println("index " + k);
								break;
							}else {
								k += 1;
							}
						} 
					while (l < nums.length) {
						if (nums[l] == two) {
							outarr[1] = l;
							System.out.println("index " + l);
							break;
						}else {
							l += 1;
						}
					}
					System.out.println("sum is " + one + " " + two);
					System.out.println(" first::" + outarr[0] + " \n second::" + outarr[1]);
					return nums;
				}
			}
		}

		return nums;

	}
}
