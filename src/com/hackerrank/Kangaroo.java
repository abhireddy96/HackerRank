package com.hackerrank;

public class Kangaroo {

	static String kangaroo(int x1, int v1, int x2, int v2) {

		for(int i=0;i<1000;i++) {
		x1+=v1;x2+=v2;	
		if(x1==x2) 
            return "YES";
		}
		return "NO";
    }
	public static void main(String[] args) {

		System.out.println(kangaroo(21,6,47,3));

	}

}
