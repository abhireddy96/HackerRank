package com.hackerrank;

import java.util.Arrays;

public class AngryProfessor {

	static String angryProfessor(int k, int[] a) {

		int cnt=0;
		Arrays.sort(a);
		for(int i:a) {
			if(i<=0) {
				cnt++;
				if(cnt>=k)
					return "NO";
			}
			else
				 return "YES";
			}
		return "YES";
	}
	public static void main(String[] args) {

		int a[]= {0 ,-1 ,2 ,1};
		System.out.println(angryProfessor(2, a));

	}

}
