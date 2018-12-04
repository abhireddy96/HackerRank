package com.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class BonAppaetit {

	static void bonAppetit(List<Integer> bill, int k, int b) {
		
        int sum=0;
		for(int i:bill)
			sum+=i;
		
		sum/=2;
		sum=sum-bill.get(k)/2;
		
		if(b==sum)
			System.out.println("Bon Appetit");
		else
			System.out.println(b-sum);

    }
	
	public static void main(String[] args) {

    List<Integer> ls=new ArrayList<Integer>();
    ls.add(3); ls.add(10); ls.add(2); ls.add(9);
    bonAppetit(ls, 1, 7);
		
	}

}
