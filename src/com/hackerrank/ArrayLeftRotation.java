package com.hackerrank;

public class ArrayLeftRotation {
	
	static int[] rotLeft(int[] a, int d) {
	    
        int n=a.length,k=0;
        int r[]=new int[n];
        
        for(int i=d;i<n;i++) 
        	r[k++]=a[i];

        for(int i = 0;i<d;i++)
        	r[k++]=a[i];
        	
		return r;
       
    }
	
	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50,60};
		int r[]= rotLeft(a,2);
		for(int i:r)
		System.out.println(i);
	}
}
