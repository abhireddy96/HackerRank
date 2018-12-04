package com.hackerrank;

import java.util.Arrays;

public class CutTheSticks {

	static int[] cutTheSticks(int[] arr) {

		int n=arr.length;
		int i=0,k=0,min;
		int[] res=new int[n];
        Arrays.sort(arr);
        min=arr[0];
		for(i=0;i<n;) {
			res[k++]=n-i;
			i++;
			 while(arr[i]==min){
	                i++;
	            }
	           min = arr[i];
		}

	return res;
	}

	public static void main(String[] args) {

		int a[]= {5,4, 4, 2, 2, 8};
		int b[]= cutTheSticks(a);
		for(int i:b)
			System.out.println(i);

	}

}
