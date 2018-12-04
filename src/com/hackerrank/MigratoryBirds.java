package com.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MigratoryBirds {

	static int migratoryBirds(List<Integer> arr) {

		int n=arr.size(),k=0;
		int a[]= {0,0,0,0,0,0};
		Collections.sort(arr);
		for(int i=1;i<=5;i++)
			for(int j=k;j<n;j++)
				if(arr.get(j)==i)
					a[i]++;
				else if(arr.get(j)>i) {
					k=j;
					break;

				}
		int max=a[5],id=5;
		for(int i=5;i>=1;i--)
			if(a[i]>=max){
				max=a[i];
				id=i;
			}
		return id;

	}

	public static void main(String[] args) {

		List<Integer> ls=new ArrayList<Integer>();
		ls.add(1);ls.add(4);ls.add(4);ls.add(4);ls.add(5);ls.add(3);
		System.out.println(migratoryBirds(ls));
	}

}
