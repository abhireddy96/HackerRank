package com.hackerrank;

import java.util.Arrays;

public class BirthdayCakeCandels {

	static int birthdayCakeCandles(int[] ar) {
		
		Arrays.sort(ar);
		int max=ar[ar.length-1],cnt=0;
		for(int i:ar)
			if(i==max) cnt++;
		
		return cnt;
    }
	
	public static void main(String[] args) {
		
		int[] a= {3,2,1,3};
		System.out.println(birthdayCakeCandles(a));

	}

}
