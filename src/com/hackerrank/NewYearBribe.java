package com.hackerrank;

public class NewYearBribe {

	static void minimumBribes(int[] q) {
		int res=0,n=q.length,temp;

		for(int i=0;i<n;i++)
			if(q[i]-(i+1) > 2) {
				System.out.println("Too chaotic");
				return;
			}    

		for(int i=1;i<=n;i++) 
			for(int j=0;j<n;j++) 
				if(q[j]==i && i==j+1) 
					break;
				else if(q[j]==i && i!=j+1) {
					res+=Math.abs(i-j+1);
					temp=q[j];
					q[j]=q[i-1];
					q[i-1]=temp;
					i=1;;  
					for(int k=0;k<n;k++) 
						System.out.print(q[k]+"\t");
					System.out.println(res);
					break;
				}

		System.out.println(res);	
		for(int j=0;j<n;j++) 
			System.out.print(q[j]+"\t");

	}

	public static void main(String[] args) {

		int a[]={1,2,5,3,7,8,6,4};
		minimumBribes(a);
	}
}
