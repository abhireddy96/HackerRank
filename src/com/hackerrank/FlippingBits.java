package com.hackerrank;

public class FlippingBits {
	static long flippingBits(long n) {

        return (long) Math.abs(Math.pow(2,32) -n - 1);

    }

	public static void main(String[] args) {
		
		System.out.println(flippingBits(35601423));
	}

}
