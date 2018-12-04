package com.hackerrank;

public class Encryption {

	static String encryption(String s) {

		s.trim();
		String res=new String();
		int len=s.length();
		int n=(int) Math.ceil(Math.sqrt(len));
		for(int i=0;i<n;i++) {
			for(int j=0;j<len;j=j+n)
				if(i+j<len)
					res+=s.charAt(i+j);
			res+=" ";
		}
		return res;
	}

	public static void main(String[] args) {

		System.out.println(encryption("feedthedog"));

	}

}
