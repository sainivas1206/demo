package com.ds;

import java.util.Arrays;

import com.stack.LinkedStack;
import com.stack.Stack;

public class TestDemo {

	public static void main(String[] args) {

		Runtime r = Runtime.getRuntime();
	
	
//		Scanner scan = new Scanner(System.in);
//		String s = scan.next();
//		int k = scan.nextInt();
//		scan.close();
//		LinkedList<String> list = new LinkedList<>();
//		list.addFirst(null);

//		int a[][] = new int[][] { { 1, 2, 3 }, { 1, 2, 3 } };
//		int b[][] = new int[][] { { 1, 2, 3 }, { 1, 2, 3 } };

//		int[] c = new int[] { 1, 2, 3 };
//		int[] d = new int[] { 1, 2, 3 };

//		System.out.println(Arrays.deepEquals(a, b));

//	System.out.println(isMatched("(({{[[]]}}))"));;

//		System.out.println(getSmallestAndLargest(s, k));
//		twoSum(new int[] {  3, 3 }, 6);
	}

	public static boolean isMatched(String expression) {
		final String opening = "({["; // opening delimiters
		final String closing = ")}]"; // respective closing delimiters
		Stack<Character> buffer = new LinkedStack<>();
		for (char c : expression.toCharArray()) {
			if (opening.indexOf(c) != -1) // this is a left delimiter
				buffer.push(c);
			else if (closing.indexOf(c) != -1) { // this is a right delimiter
				if (buffer.isEmpty()) // nothing to match with
					return false;
				if (closing.indexOf(c) != opening.indexOf(buffer.pop()))
					return false; // mismatched delimiter
			}
		}
		return buffer.isEmpty(); // were all opening delimiters matched?
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
		int[] outarr = new int[2];
		int one = 0;
		int two = 0;
		int i, j;
		for (i = 0; i < nums.length; i++) {
			one = nums[i];
			for (j = i + 1; j < nums.length; j++) {
				two = nums[j];

				if (one + two == target) {
					int k = 0, l = 0;

					if (one == two) {
						int p = 0;
						while (k < nums.length) {
							if (nums[k] == one) {

								outarr[p] = k;
								p++;
								System.out.println("indexw " + k);
//								break;
							}
							k += 1;

						}
					} else {

						while (k < nums.length) {
							if (nums[k] == one) {
								outarr[0] = k;
								System.out.println("index " + k);
								break;
							} else {
								k += 1;
							}
						}
						while (l < nums.length) {
							if (nums[l] == two) {
								outarr[1] = l;
								System.out.println("index " + l);
								break;
							} else {
								l += 1;
							}
						}
					}
					System.out.println("sum is " + one + " " + two);
					System.out.println(" first::" + outarr[0] + " \n second::" + outarr[1]);
				}
			}
		}

		return outarr;

	}
}
