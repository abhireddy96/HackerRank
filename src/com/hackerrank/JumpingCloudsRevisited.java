package com.hackerrank;

public class JumpingCloudsRevisited {

	static int jumpingOnClouds(int[] c, int k) {

		int energy=100;

		for(int i=0;i<c.length;i=i+k)
			if(c[i]==0)
				energy-=1;
			else if(c[i]==1)
				energy-=3;

        return energy;

	}

	public static void main(String[] args) {

		int a[]= {0 ,0 ,1, 0 ,0 ,1 ,1, 0};
		System.out.println(jumpingOnClouds(a,2));

	}

}
