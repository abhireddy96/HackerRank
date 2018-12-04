package com.hackerrank;

public class CamelCase {

	static int camelcase(String s) {

		int cnt=1;
		for(int i=0;i<s.length();i++) {
			int c=(int)s.charAt(i);
			if(c>=65 && c<=90)
				cnt++;
		}

		return cnt;
	}

	public static void main(String[] args) {

		System.out.println(camelcase("valarMorghulis"));

	}

}
