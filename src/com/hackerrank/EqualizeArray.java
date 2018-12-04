package com.hackerrank;

import java.util.Arrays;

public class EqualizeArray {

	static int equalizeArray(int[] arr) {

		int max=0,cnt,k=0;
		Arrays.sort(arr);
		for(int i=k;i<arr.length;i++) {
			cnt=1;
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j] && j==arr.length-1) {
					cnt++;
					if(cnt>=max)
						max=cnt;
					System.out.println(arr[i]+"  "+arr[j]+" = "+cnt);
		            return arr.length-max;
				}
				else if(arr[i]==arr[j]) {
					cnt++;
				}
				else {
					if(cnt>=max)
						max=cnt;
					System.out.println(arr[i]+"  "+arr[j]+" = "+cnt);
					k=j;
					break;
				} 
			}
		}
		return arr.length-max;
	}

	public static void main(String[] args) {

		int a[]= {3, 3 ,2, 1 ,3};
		System.out.println(equalizeArray(a));

	}

}
