package com.hackerrank;

import java.util.Arrays;

public class TwoStrings {

	static String twoStrings(String s1, String s2) {
		
		char[] first=s1.toCharArray();
		Arrays.sort(first);
		char[] second=s2.toCharArray();
		Arrays.sort(second);
		s1=new String(first);
		s2=new String(second);
		for(int i=0;i<s1.length();i++)	
			if(s2.contains(Character.toString(s1.charAt(i))))
				return "YES";
		return "NO";
	}

	public static void main(String[] args) {

		System.out.println(twoStrings("hello","wrd"));

	}

}
