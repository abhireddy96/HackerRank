package com.hackerrank;

public class StairCase {

	static void staircase(int n) {
    
		for(int i=1;i<=n;i++) {
			for(int j=n;j>0;j--) {
				if(j<=i)
				  System.out.print("#");
				else
				  System.out.print(" ");
			}
		    System.out.print("\n");	
		}
    }
	
	public static void main(String[] args) {
		
		staircase(5);

	}
}
