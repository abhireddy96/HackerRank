package com.hackerrank;
import java.io.IOException;

public class MagicSquare {

    // Complete the formingMagicSquare function below.
    static int formingMagicSquare(int[][] s) {
    
        int[][] m=s;
        //int n = m.length;
        int[] sumr = new int[3];
        int[] sumc = new int[3];
        
        int i,j;
        int cnt=0;
        
        
        for(i=0;i<m.length;i++){
            sumr[i] = 0;
            sumc[i] = 0;
        }
        
        for(i=0;i<m.length;i++){
            for(j=0;j<m.length;j++)
                sumr[i]+=m[i][j];
        }
        
        for(i=0;i<m.length;i++){
            for(j=0;j<m.length;j++)
                sumc[i]+=m[j][i];
        }
        
        System.out.println(sumr[0]+" "+sumr[1]+" "+sumr[2]);
        System.out.println(sumc[0]+" "+sumc[1]+" "+sumc[2]);
		return cnt;
    
        /*
        for(i=0;i<m.length;i++)
            if(sumr[i]==sumc[i])
                continue;
            else
                cnt=cnt+Math.abs(sumr[i]-sumr[i]);
        

           return cnt; */
        

    }

    public static void main(String[] args) throws IOException {

        int[][] s = {{4,9,2},{3,5,7},{8,1,5}};

       

        int result = formingMagicSquare(s);
        System.out.println(result);
    }
}