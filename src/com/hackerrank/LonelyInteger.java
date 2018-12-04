package com.hackerrank;

import java.util.Arrays;

public class LonelyInteger {

	static int lonelyinteger(int[] a) {

		Arrays.sort(a);
		
		for(int i=0;i<a.length;i=i+2)
			if(i+1<a.length && a[i]==a[i+1])
				continue;
			else return a[i];
		return -1;
			

    }
	
	public static void main(String[] args) {

    int a[]= {0};
    System.out.println(lonelyinteger(a));

	}

}
