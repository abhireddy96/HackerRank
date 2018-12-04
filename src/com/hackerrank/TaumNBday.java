package com.hackerrank;

import java.math.BigInteger;

public class TaumNBday {

	static BigInteger taumBday(int b, int w, int bc, int wc, int z) {
		
		bc = (wc+z<bc)?wc+z:bc;
		wc = (bc+z<wc)?bc+z:wc;
		return (BigInteger.valueOf(b).multiply(BigInteger.valueOf(bc))).add(BigInteger.valueOf(w).multiply(BigInteger.valueOf(wc)));
		}
	public static void main(String[] args) {
		
		System.out.println(taumBday(27984, 1402, 619246 ,615589 ,247954));

	}

}
