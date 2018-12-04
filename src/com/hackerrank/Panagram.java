package com.hackerrank;

public class Panagram {

	static String pangrams(String s) {
	
	s=s.toLowerCase().trim();
	if(s.length()<26)
		return "not panagram";
	
    for(char i='a';i<='z';i++)
    	if(s.indexOf(i)<0) 
    		return "not panagram";
    		
    return "panagram";
    }
	
	public static void main(String[] args) {

      System.out.println(pangrams("We promptly judged antique ivory buckles for the next prize"));

	}

}
