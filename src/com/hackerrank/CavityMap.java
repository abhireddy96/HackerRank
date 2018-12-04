package com.hackerrank;

public class CavityMap {

	static String[] cavityMap(String[] grid) {

		int n=grid.length;
		char[][] c=new char[n][n];
		String[] s=new String[n];
		for(int i=0;i<n;i++)
			c[i]=grid[i].toCharArray();
		
		
		for(int i=1;i<n-1;i++)
			for(int j=1;j<n-1;j++)
				if(c[i][j]>c[i+1][j] &&
				   c[i][j]>c[i-1][j] &&
				   c[i][j]>c[i][j-1] &&
				   c[i][j]>c[i][j+1] )
					   c[i][j]='X';
		
		for(int i=0;i<n;i++)
			s[i]=String.valueOf(c[i]);
		
		return s;
	}

	public static void main(String[] args) {

		String[] a={"1112","1912","1892","1234"};
		String[] b=cavityMap(a);
		for(String s:b)
			System.out.println(s);
	}
}
