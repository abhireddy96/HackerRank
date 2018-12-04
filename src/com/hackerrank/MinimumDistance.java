package com.hackerrank;

public class MinimumDistance {

	static int minimumDistances(int[] a) {
		int min=Integer.MAX_VALUE;

		for(int i=0;i<a.length-1;i++)
			for(int j=i+1;j<a.length;j++)
				if(a[i]==a[j]) {
					if(Math.abs(j-i)<=min)
						min=Math.abs(j-i);
					break;
				}
		if(min==Integer.MAX_VALUE)		
			return -1;
		return min;

	}
	public static void main(String[] args) {

		int a[]= {7 ,1 ,3, 4, 1 ,7};
		System.out.println(minimumDistances(a));

	}

}
