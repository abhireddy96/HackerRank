package com.hackerrank;

import java.util.Arrays;

public class ElectronicShop {

	static int getMoneySpent(int[] keyboards, int[] drives, int b) {
		
		Arrays.sort(keyboards);
		Arrays.sort(drives);
		int max=0;
		for(int i=0;i<keyboards.length;i++)
			for(int j=0;j<drives.length;j++)
				if(keyboards[i]+drives[j]>max && keyboards[i]+drives[j]<=b)
					max=keyboards[i]+drives[j];
				else if(keyboards[i]+drives[j]>b)
					break;
		
		return max;
        
    }
	public static void main(String[] args) {
	    int[] a= {4};
	    int[] b= {5};
		System.out.println(getMoneySpent(a, b,5));
	}

}
