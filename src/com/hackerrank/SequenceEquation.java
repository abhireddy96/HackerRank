package com.hackerrank;

public class SequenceEquation {

	static int[] permutationEquation(int[] p) {

		int res[]=new int[p.length];

		for(int i=1;i<=p.length;i++)
			for(int j=0;j<p.length;j++)
				if(i==p[j]) {
					for(int k=0;k<p.length;k++)
						if(j+1==p[k]) {
							res[i-1]=k+1;
							break;
						}
					break;
				}
		return res;

	}

	public static void main(String[] args) {

		int a[]= {5,2,1,3,4};
		int b[]=permutationEquation(a);
		for(int i:b)
			System.out.print(i+"\t");

	}

}
