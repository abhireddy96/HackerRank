package com.hackerrank;

public class CaesarCipher {

	static String caesarCipher(String s, int k) {
	
		k=k%26;
		char[] c=s.toCharArray();
		String res = "";
		for(int i=0;i<c.length;i++) {
			int j=(int)c[i];
			if((j>=97 && j<=122) || (j>=65 && j<=90))
				if(((j+k<=122) && j>90) || ((j+k<=90) && j<97))
				  res+=Character.toString((char)(j+k));
				else
					res+=Character.toString((char)(j+k-26));
			else
				res+=Character.toString((char)j);
				
		} 
		return res;


    }
	
	public static void main(String[] args) {


		System.out.println(caesarCipher("www.abc.xy",87));

	}

}
