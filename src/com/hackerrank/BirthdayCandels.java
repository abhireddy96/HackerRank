package com.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class BirthdayCandels {

	static int birthday(List<Integer> s, int d, int m) {
    
		int cnt=0;
		for(int i=0;i<=s.size()-m;i++) {
			int sum=0;
			for(int j=i;j<i+m;j++) {
				System.out.print(s.get(j)+"\t");
				sum+=s.get(j);}
			System.out.println("sum = "+sum);
			if(sum==d)
				cnt++;
		 }
		return cnt;
		    
    }
	
	public static void main(String[] args) {
		
		List<Integer> ls=new ArrayList<Integer>();
		ls.add(1);ls.add(2);ls.add(1);ls.add(3);ls.add(2);
		System.out.println(birthday(ls,3,2));
	}

}
