package com.hackerrank;

public class ServiceLane {

	static int[] serviceLane(int[] width, int[][] cases) {

		int res[]=new int[cases.length];
		for(int i=0;i<cases.length;i++) {
			int min=Integer.MAX_VALUE;
			for(int j=cases[i][0];j<=cases[i][1];j++)
			{
				if(width[j]<=min)
					min=width[j];
			}
			res[i]=min;
		}
		return res;
	}

	public static void main(String[] args) {
		int a[]= {1,2,2,2,1};
		int b[][]= {
				{2,3},{1,4},{2,4},{2,4},{2,3}
		};
		int c[]=serviceLane(a,b); 
		for(int i:c)
			System.out.println(i);


	}

}
