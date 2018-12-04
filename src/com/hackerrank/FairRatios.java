package com.hackerrank;

public class FairRatios {

	static String fairRations(int[] B) {
    
		int cnt=0,sum=0;
		
		for(int s:B)
			sum+=s;
		
		if(sum%2!=0) {
			return "NO";
		}
		
		for(int i=0;i<B.length;i++) {
			
			if(i==B.length-1 && B[i]%2==1) {
				return "NO";
			}
			
			if(B[i]%2==1) {
				B[i]+=1;
				B[i+1]+=1;
				cnt+=2;
			}
		}
      return Integer.toString(cnt);
    }
	
	public static void main(String[] args) {
		int a[]= {1,2};
		System.out.println(fairRations(a));
	
	}

}
