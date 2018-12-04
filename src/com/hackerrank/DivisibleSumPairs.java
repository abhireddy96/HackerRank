package com.hackerrank;

import java.util.Arrays;

public class DivisibleSumPairs {
	
	static int divisibleSumPairs(int n, int k, int[] ar) {
		Arrays.sort(ar);
		int cnt=0;
		
		for(int i=0;i<n-1;i++)
			for(int j=i+1;j<n;j++)
				if((ar[i]+ar[j])%k==0) {
					cnt++;}
					
		return cnt;
    }

	public static void main(String[] args) {
		
		int a[]= {1,3,2,6,1,2};
		System.out.println(divisibleSumPairs(6,3,a));

	}

}
