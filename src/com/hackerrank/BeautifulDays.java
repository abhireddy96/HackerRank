package com.hackerrank;

public class BeautifulDays {

	static int beautifulDays(int i, int j, int k) {
        int cnt=0;
		for(int l=i;l<=j;l++) {
			float num=Math.abs(l-reverseNum(l))/(float)k;
			System.out.println(l+" "+reverseNum(l)+" "+num);
			if((float)num==(int)num)
				cnt++;
			}
		return cnt;

    }
	static int reverseNum(int n) {
		int r,res=0;
		while(n!=0) {
			r=n%10;
			res=res*10+r;
			n=n/10;
		}
		return res;
	}
	
	public static void main(String[] args) {
		
		System.out.println(beautifulDays(20,23,6));

	}

}
