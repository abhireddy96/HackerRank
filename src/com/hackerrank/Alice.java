package com.hackerrank;

public class Alice {

	public static void main(String[] args) {
		
	    int scores[]= {100,100,50,40,40,20,10};
	    int alice[]= {5,25,50,120};
		
	    int[] arr = new int[scores.length];
	    
        int k=0;
        
        
        for(int i=0;i<scores.length;i++) {
        	arr[k++]=scores[i];
            for(int j=i+1;j<scores.length-1;j++)
                if(scores[i]==scores[j])
                     continue;
                else {
                	i=j-1;
                	break;
                }            
         }   
        
        for(int i=0;i<alice.length;i++) {
        	
            for(int j=arr.length-1;j>=0;j--)
                if(alice[i]>arr[j] && j>0)
                	continue;
            
                else if(alice[i]>arr[j]) {
                	System.out.println(alice[i]+" = 1");
                	break;}
      
                else if(alice[i]<arr[j]) {
                	System.out.println(alice[i]+" = "+(j+2));
                	break;}
            
                else {
                	System.out.println(alice[i]+" = "+(j+1));
                	break;} 
        }
    	
     }
	
}

	
    