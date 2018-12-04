package com.hackerrank;

public class TutoriaIntro {

	static int introTutorial(int V, int[] arr) {

		for(int i=0;i<arr.length;i++)
			if(V==arr[i]) 
				return i;
		return -1;

    }
	
	public static void main(String[] args) {
		
		int a[]= {1,4,5,7,9,12};
		System.out.println(introTutorial(4,a));

	}

}
