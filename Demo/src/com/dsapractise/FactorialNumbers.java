package com.dsapractise;

import java.util.ArrayList;

public class FactorialNumbers {

	public static void main(String[] args) {
		System.out.println(factorialNumbers(120));
	}

	static ArrayList<Long> arr = new ArrayList<>();
	static long fact;

	static ArrayList<Long> factorialNumbers(long N) {
		
		long fact = 1;
		for(int i = 2; fact<=N;i++) {
			arr.add(fact);
			fact = factorial(i);
		}
		return arr;

	}

	public static long factorial(long n) {
		if (n == 0)
			return 1;

		return n * factorial(n - 1);
	}
	
    static ArrayList<Long>factorialNumbers1(long n){
        // code here
        long fact=1;
        ArrayList<Long>arr=new ArrayList<>();
        for(int i=1;fact<=n;i++)
        {
            fact=fact*i;
            if(fact<=n)
            {
                arr.add(fact);
            }
        }
        return arr;
    }
}
