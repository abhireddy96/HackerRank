package com.hackerrank;

import java.util.Arrays;

public class SockMerchant {

	static int sockMerchant(int n, int[] ar) {

		int pair=0;
		Arrays.sort(ar);

		for(int i=0;i<n;) {
			
			int cnt=1;
			for(int j=i+1;j<n;j++) {
				
				if(ar[i]==ar[j]) 
					cnt++;
				
				if(j==n-1) { 
					System.out.println(ar[i]+" = "+cnt);
					pair+=(cnt/2);
					return pair;
					}
			
				else if(ar[i]!=ar[j]){
					System.out.println(ar[i]+" = "+cnt);
					pair+=(cnt/2);
					i=j;
					break;
				}
			}
		}
		return pair;
	}

	public static void main(String[] args) {

		//int a[]= {10,20,20,10,10,30,50,10,20};
		int a[]= {1,1,0,2,2,4,3,3,5,5};
		System.out.println(sockMerchant(10,a));
	}

}
