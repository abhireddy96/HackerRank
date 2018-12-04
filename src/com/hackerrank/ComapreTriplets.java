package com.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class ComapreTriplets {

	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		
		List<Integer> result = new ArrayList<Integer>();
		int aScore=0,bScore=0;
		
		for(int i=0;i<3;i++)
			if(a.get(i)>b.get(i))
				aScore++;
			else if(a.get(i)==b.get(i)) 
				continue;
			else bScore++;
		result.add(aScore);
		result.add(bScore);
		
		return result;
    }
	public static void main(String args[]) {
		List<Integer> a= new ArrayList<Integer>();
		List<Integer> b= new ArrayList<Integer>();
		a.add(17);a.add(28);a.add(30);
		b.add(99);b.add(16);b.add(8);
		List<Integer> r=compareTriplets(a,b);
		System.out.println(r.get(0)+" "+r.get(1));
	}
}
