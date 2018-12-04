package com.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class Sort012 {

private static int as[];

public static void main (String[] args) {
	    
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		as = null;
		for(int i=0;i<n;i++) {
			int m=scan.nextInt();
			as= null;
			for(int j=0;j<m;j++)
				as[j]=scan.nextInt();
			Arrays.sort(as);
			for(int j=0;j<m;j++)
			  System.out.print(as[j]+"\t");
			System.out.println();
		}
		scan.close();
	}

}
