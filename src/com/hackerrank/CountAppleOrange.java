package com.hackerrank;

public class CountAppleOrange {

	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

		int aCount=0,oCount=0;
		for(int i:apples)
			if(a+i>=s && a+i<=t) aCount++;
		for(int i:oranges)
			if(b+i<=t && b+i>=s) oCount++;
		System.out.println(aCount);
		System.out.println(oCount);

    }
	
	public static void main(String[] args) {
		int a[]= {-2,2,1};
		int b[]= {5,-6};
		countApplesAndOranges(7, 11, 5, 15,a,b);
	}

}
