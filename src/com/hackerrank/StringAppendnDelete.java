package com.hackerrank;

public class StringAppendnDelete {

	static String appendAndDelete(String s, String t, int k) {
		
		   int m=s.length();
	        int n=t.length();
	        int cnt=0;
	        for(int i=0;i<Math.min(m,n);i++)
	                if(s.charAt(i)==t.charAt(i))
	                    cnt++;
	                else 
	                    break;
	        
	        int sCnt=m-cnt;
	        int tCnt=n-cnt;
	        
	        if(m+n<=k || (sCnt+tCnt<=k && (k-sCnt+tCnt)%2==0))
	            return "Yes";
	        
	        return "No";
}
        		

	public static void main(String[] args) {

		System.out.println(appendAndDelete("ash","ashley",2));

	}

}
