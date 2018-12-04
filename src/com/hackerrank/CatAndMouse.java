package com.hackerrank;

public class CatAndMouse {

	static String catAndMouse(int x, int y, int z) {

		int a=Math.abs(x-z);
		int b=Math.abs(y-z);
		
		if(a<b)  return "Cat A"; 
		else if(a>b)  return "Cat B";
		else return "Mouse C";
		

    }
	
	public static void main(String[] args) {
		
		System.out.println(catAndMouse(1,3,2));
	}

}
