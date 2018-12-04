package com.hackerrank;

public class BeautifulTriplets {

	static int beautifulTriplets(int d, int[] arr) {
		int cnt=0;
		for (int i=0;i<(arr.length);i++)
		    for (int j=i+1;j<arr.length;j++)
		        if ((arr[j] - arr[i])==d)
		            for (int k=j+1;k<arr.length;k++)
		                if ((arr[k]-arr[j]) ==d){
		                	cnt++;
		                	break;
		                	}
		 return cnt;
    }
	
	public static void main(String[] args) {
		int[] a= {1 ,2, 4, 5 , 7  ,8  , 10};
		System.out.println(beautifulTriplets(3,a));
	}
}
