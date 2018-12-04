package com.hackerrank;

public class JumpingClouds {

	static int jumpingOnClouds(int[] c) {
		
		int cnt=0;
		for(int i=0;i<c.length-1;)
			
			if(i+2<c.length && c[i+2]!=1) {
				i+=2;
				cnt++;
				System.out.println("cnt = "+cnt+" i = "+i);
			}
			else if(i+2<c.length && c[i+2]==1) {
				i+=1;
				cnt++;
				System.out.println("cnt = "+cnt+" i = "+i);
			}
			else {
				i+=1;
				cnt++;
				System.out.println("cnt = "+cnt+" i = "+i);
			}

		return cnt;


    }
	
	public static void main(String[] args) {

      int a[]= {0,0,0 ,1 ,0 ,0};
      System.out.println(jumpingOnClouds(a));

	}

}
