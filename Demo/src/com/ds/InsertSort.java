package com.ds;

public class InsertSort {
	
	public static void main(String[] args) {
		
		String str = new String();
		char[] arr = {'b','c','d','e','f','a'};
		for(char a = 'a'; a<=100;a++) {
			System.out.println(a);
		}
//		insertionSort(arr);
		
//		System.out.println(arr);
	}
	
	public static void insertS(char[] arr) {
		int n = arr.length;
		for(int k = 1; k<n-1; k++) {
			while(arr[k-1] > arr[k]) {
				
			}
		}
		
	}
	
	
	
	
	public static void insertionSort(char[] data) {
		int n = data.length;
		for(int k = 1; k < n; k++) {
			char c = data[k];
			int j=k;
			while(j>0 && data[j-1]>c) {
				data[j] = data[j-1];
				j--;
			}
					data[j] = c;
		}
		
	}
}
