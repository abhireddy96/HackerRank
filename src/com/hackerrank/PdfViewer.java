package com.hackerrank;

import java.util.Arrays;

public class PdfViewer {

	static int designerPdfViewer(int[] h, String word) {
		
		char[] alpha= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] letters=word.toCharArray();
        int[] res=new int[word.length()];
        int sum=0,k=0;
        
        for(char i:letters)
        	for(int j=0;j<alpha.length;j++)
        		if(i==alpha[j]) {
        			res[k++]=h[j];
        			break;
        		 }
        Arrays.sort(res);
        
        sum+=res[res.length-1]*res.length;
		
		return sum;


    }

	public static void main(String[] args) {
		
		int a[]= {1,3,1,3,1, 4 ,1 ,3 ,2 ,5 ,5 ,5 ,5 ,5 ,5 ,5 ,5 ,5 ,5 ,5 ,5 ,5,5,5,5,5};
		System.out.println(a.length);
		System.out.println(designerPdfViewer(a,"abc"));
	
		
	}

}
