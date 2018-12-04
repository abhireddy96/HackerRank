package com.hackerrank;

public class CountValleys {

	static int countingValleys(int n, String s) {

		int level=0,cnt=0,k;
		for(int i=0;i<s.length();i++) {

			if(level==0 && 'D'==s.charAt(i)) {
				k=i;
				for(int j=k;j<n;j++) {
					if('U'==s.charAt(j))
						level++;
					else if('D'==s.charAt(j))
						level--;
					if(level==0) {
						cnt++;
						i=j;
						break;
						}
				}
			}
			else if('D'==s.charAt(i))
				level--;
			else if('U'==s.charAt(i))
				level++;
			System.out.print(level+"\t");
		}
		return cnt;

	}

	public static void main(String[] args) {

		System.out.println(countingValleys(8,"UDDDUDUU"));
	}

}
