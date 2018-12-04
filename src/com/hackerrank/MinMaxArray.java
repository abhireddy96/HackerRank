package com.hackerrank;

import java.util.Arrays;

public class MinMaxArray {

	static void miniMaxSum(int[] arr) {
        
		int min=0,max=0,i;
        Arrays.sort(arr);
        
        for(i=0;i<=3;i++)
        	min+=arr[i];
        for(i=1;i<=4;i++)
        	max+=arr[i];
        System.out.println(min+" "+max);

    }
	
	public static void main(String[] args) {
		
		int a[]= {1,5,5,7,9};
		miniMaxSum(a);

	}

}
