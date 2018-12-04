package com.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class GameofThrones {

	static String gameOfThrones(String s) {
		
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		char[] letters=s.toCharArray();
		for(char key:letters)
			if(map.containsKey(key))
				map.put(key,map.get(key)+1);
			else
				map.put(key,1);

		int odd = 0;
		for(Integer count : map.values())
			if(count % 2 !=0)
			{
				odd++;
				continue;
			}


		if(odd > 1) 
			return "NO";
		else
			return "YES";
	}
	
	public static void main(String[] args) {

       System.out.println(gameOfThrones("aaabbbb"));

	}

}
