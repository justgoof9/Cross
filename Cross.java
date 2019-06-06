
import java.util.Arrays;
import java.io.*; 


class Cross {


    public static int sumCross(int [][] m, int row, int col) {
        int sum = 0;

        for(int i = 0; i < m[0].length; i++) {
            if(m[row][i] == m[row][col]){
                i++;
            }
            sum += m[row][i];
        }
            for(int j = 0; j < m.length; j++) {
                sum+=m[j][col];
                
            }
        return sum;
    }
/*
    public static int[][] removeCross(int [][] m, int row, int col) {
        int a [][] = m; 
        
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[0].length; j++) {
                if(m[])
            }
        }
    }

    */

    public static int[][] sortedRows (int[][] m) {
        for (int i = 0; i < m.length; i++) 
            Arrays.sort(m[i]);  
        return m;

     }

     public static int[][] sortedColumns(int [][] m) {
         for(int i = 0; i < m[0].length; i++) 
             Arrays.sort(m[i]);
         return m;
     }
}