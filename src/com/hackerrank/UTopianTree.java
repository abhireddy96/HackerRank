package com.hackerrank;

public class UTopianTree {

	static int utopianTree(int n) {
		int sum=1;
		for(int i=1;i<=n;i++)
			if(i%2==0)
				sum+=1;
			else
				sum*=2;
		return sum;

    }
	
	public static void main(String[] args) {

     System.out.println(utopianTree(5));

	}

}
