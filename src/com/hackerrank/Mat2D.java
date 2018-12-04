package com.hackerrank;
import java.io.IOException;

public class Mat2D {

	// Complete the hourglassSum function below.
	static int hourglassSum(int[][] arr) {

		int i,j,max=0;
		int resSize=arr.length-2;
		int[][] rarr=new int[resSize][resSize];

		for(i=0;i<resSize;i++) 
			for(j=0;j<resSize;j++) 
				rarr[i][j] = arr[i][j]+arr[i][j+1]+arr[i][j+2]+
				arr[i+1][j+1]+
				arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];		

		max=rarr[0][0];

		for(i=0;i<resSize;i++) 
			for(j=0;j<resSize;j++) 
				if(rarr[i][j]>max) 
					max=rarr[i][j];

		return max;  
	}

	public static void main(String[] args) throws IOException {

		int[][] arr = {{-9,-9,-9,1 ,1,1 },
				{0,-9,0,4,3,2},
				{-9,-9,-9,1,2,3},
				{0,0,8,6,6,0},
				{0,0,0,-2,0,0},
				{0,0,1,2,4,0}};

		int result = hourglassSum(arr);
		System.out.println(result);

	}
}
