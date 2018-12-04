package com.hackerrank;

public class FunnyString {

	static String funnyString(String s) {
 
		int n=s.length();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
		    a[i]=(int) s.charAt(i);
		    System.out.println(a[i]);}
		
		for(int i=0;i<n-1;i++) 
				if(Math.abs(a[i]-a[i+1])!=Math.abs(a[n-i-1]-a[n-i-2]))
					return "Not Funny";
		
        return "Funny";
    }
	
	public static void main(String[] args) {
		
		System.out.println(funnyString("acxz"));

	}

}
