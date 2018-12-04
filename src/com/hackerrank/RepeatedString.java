package com.hackerrank;

public class RepeatedString {

	static long repeatedString(String s, long n) {
		
		int aCnt=0;
		for(int i=0;i<s.length();i++) 
			if(s.charAt(i)=='a') 
				aCnt++;
				
		long res=n/s.length();
		long rem=n-res*s.length();
		//System.out.println(rem);
		res*=aCnt;
		
		for(int i=0;i<rem;i++) 
			if(s.charAt(i)=='a')
				res++;
		
		return res;
    }
	
	public static void main(String[] args) {
		System.out.println(repeatedString("aba",10));

	}

}
