package com.hackerrank;

import java.util.Arrays;

public class HurdleRace {

	static int hurdleRace(int k, int[] height) {

		Arrays.sort(height);
		if(height[height.length-1]>k)
			return height[height.length-1]-k;
		else 
			return 0;

    }
	
	public static void main(String[] args) {
		
		int a[]= {1 ,6 ,3 ,5 ,2};
		System.out.println(hurdleRace(4,a));
	}

}
