package com.hackerrank;

public class GradingStudents {
	
	static int[] gradingStudents(int[] grades) {
		int n=grades.length;
		int res[]=new int[n];
		
		for(int i=0;i<n;i++)
			if(grades[i]<38)
				res[i]=grades[i];
			else if((grades[i])%5>2)
				res[i]=grades[i]+5-grades[i]%5;
			else
				res[i]=grades[i];
		
		return res;
	}
	public static void main(String[] args) {
		
		int[] a= {73,67,38,33};
		int[] b=gradingStudents(a);
		for(int i:b)
		System.out.print(i+"\t");

	}

}
