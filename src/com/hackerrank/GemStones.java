package com.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class GemStones {

	static int gemstones(String[] a) {
		
		int cnt=0;
		Map<Character,Integer> m=new HashMap<Character,Integer>();
		
		for(char c='a';c<='z';c++) 
			m.put(c,0);
		
		for(Entry<Character, Integer> entry : m.entrySet()) {
			for(String s:a) 
				if(s.indexOf(entry.getKey())>-1)
					m.put(entry.getKey(),entry.getValue()+1);
				
		
			if(m.get(entry.getKey())==a.length)
				cnt++;
		}
		return cnt;
    }
	
	public static void main(String[] args) {
		String[] s= {"abcdde","baccd" ,"eeabg"};
		System.out.println(gemstones(s));
	}
}
