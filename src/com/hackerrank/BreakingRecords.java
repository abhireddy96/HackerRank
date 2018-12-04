package com.hackerrank;

public class BreakingRecords {

	static int[] breakingRecords(int[] scores) {
		int[] res= {0,0};
		int min=scores[0],max=scores[0];
		
		for(int i:scores)
			if(i<min) {
				min=i;
				res[1]++;
			}
			else if(i>max) {
			max=i;
			res[0]++;
		}
		
		return res;
    }
	
	public static void main(String[] args) {
		int[] a= {10,5,20,20,4,5,2,25,1};
		int[] b=breakingRecords(a);
		for(int i:b)
			System.out.print(i+"\t");
	}

}
