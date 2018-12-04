package com.hackerrank;

public class SherlocknSquares {

	static int squares(int a, int b) {
		
        int start=(int) Math.ceil(Math.sqrt(a));
        int end=(int) Math.floor(Math.sqrt(b));
        
        return end-start+1;
			
    }
	
	public static void main(String[] args) {
		
		System.out.println(squares(3,9));

	}

}
