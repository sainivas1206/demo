package com.dsapractise;

public class ArrayAndList {

	public static void main(String[] args) {

		
		
		
		
		
		
		
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static String stringCompression(String str) {

		char[] chr = str.toCharArray();
		char[] arr = new char[str.length()];
		int k = 0;
		for (int i=0; i < str.length();i++) {
			arr[k] = chr[i];
			int count = 1;
			while (chr[i] == chr[i + 1]) {
				count++;
				i++;
				if (i == str.length() - 1) {
					arr[i] = (char) (count + 48);
					return new String(arr);
				}
			}
			if (count != 1) {
				arr[k + 1] = (char) (count + 48);
				k++;
			}
			k++;
		}
		return new String(arr);
	}

	public static boolean isPalindromePremutation(String permutation) {

		char[] ch = permutation.toCharArray();
		int[] letters = new int[128];
		int start = ch[0], end = ch[ch.length - 1];
		for (char c : ch) {
			letters[c]++;
		}
		int count = 0;

		for (int k = start; k <= end; k++) {

			if (letters[k] % 2 == 1) {
				count++;
				if (count >= 2) {
					return false;
				}
			}
		}

		return true;
	}

	void replaceSpaces(char[] str, int trueLength) {
		int spaceCount = 0, index, i = 0;
		for (i = 0; i < trueLength; i++) {
			if (str[i] == ' ') {
				spaceCount++;
			}
		}

		index = trueLength + spaceCount * 2;
		if (trueLength < str.length)
			str[trueLength] = '\0';
		for (i = trueLength - 1; i >= 0; i--) {
			if (str[i] == ' ') {
				str[index - 1] = '0';
				str[index - 2] = '2';
				str[index - 3] = '%';
				index = index - 3;
			} else {
				str[index - 1] = str[i];
				index--;
			}
		}
	}

	static String sort(String s) {
		char[] content = s.toCharArray();
		java.util.Arrays.sort(content);
		return new String(content);
	}

	static boolean permutation(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		return sort(s).equals(sort(t));
	}

	static boolean permutation1(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}

		int[] letters = new int[128];
		char[] s_array = s.toCharArray();
		for (char c : s_array) {
			letters[c]++;
			System.out.print(letters[c] + "  " + c + "  \n");
		}
		System.out.println("++++");

		for (int i = 0; i < t.length(); i++) {
			int c = (int) t.charAt(i);
			letters[c]--;
			System.out.print(letters[c]);
			if (letters[c] < 0) {
				return false;
			}
		}
		return true;
	}

	static boolean isUniqueChars(String str) {
		if (str.length() > 128)
			return false;

		boolean[] char_set = new boolean[128];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (char_set[val]) {// Already found this char in string
				return false;
			}
			char_set[val] = true;
		}
		return true;
	}

	static boolean isUniqueChars1(String str) {
		int checker = 0;
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i) - 'a';
			if ((checker & (1 << val)) > 0) {
				return false;
			}
			checker |= (1 << val);
		}
		return true;
	}

}
