package com.hackerrank;

public class DrawingBook {

	static int pageCount(int n, int p) {
        
		int first=Math.abs(p)/2;
		int last=Math.abs(n-p)/2;
		if(n%2==0)
			last=last+1;
		return Math.min(first,last);
    }
	
	public static void main(String[] args) {
		
		System.out.println(pageCount(6,5));
	}

}
