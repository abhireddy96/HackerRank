package com.hackerrank;

import java.math.BigInteger;

public class LongFactorials {

	static void extraLongFactorials(int n) {
		
		BigInteger sum=new BigInteger("1");
		for(int i=2;i<=n;i++)
			sum=sum.multiply(BigInteger.valueOf(i));
		System.out.println(sum);

	}

	public static void main(String[] args) {
		extraLongFactorials(25);

	}

}
