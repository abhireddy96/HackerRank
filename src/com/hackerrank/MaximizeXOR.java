package com.hackerrank;

public class MaximizeXOR {

	static int maximizingXor(int l, int r) {

		int max=0;

		for(int i=l;i<=r;i++)
			for(int j=i+1;j<=r;j++)
				if((i^j)>= max)
					max=i^j;
		return max;
	}
	public static void main(String[] args) {

		System.out.println(maximizingXor(5,6));
	}

}
