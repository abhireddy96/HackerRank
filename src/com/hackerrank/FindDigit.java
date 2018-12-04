package com.hackerrank;

public class FindDigit {

	static int findDigits(int n) {
		int m=n,cnt=0,r;
		while(n!=0) {
			 r=n%10;
             if(r>0 && m%r==0) 
				cnt++;
             n=n/10;

		}
		return cnt;
	}

	public static void main(String[] args) {

		System.out.println(findDigits(106108048));

	}

}
