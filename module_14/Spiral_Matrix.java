package module_14;

import javax.swing.Spring;

public class Spiral_Matrix {

    public static void spiral_M(int matrix[][]){
        int startR = 0;
        int startC = 0;
        int endR= matrix.length-1;
        int endC = matrix.length-1;

        while(startR<=endR && startC<=endC){
            //top
        for(int j=0;j<=endR;j++){
            System.out.print(matrix[startR][j]+" ");
        }
        //right
        for(int i=startR+1;i<=endC;i++){
            System.out.print(matrix[i][endC]+" ");
        }
        //bottom
        for(int j=endC-1;j>=startC;j--){
            if(startR==endR){
                break;
            }
            System.out.print(matrix[endR][j]+" ");

        }
        //left
        for(int i=endR-1;i>=startR+1;i--){
            if(startC==endC){
                break;
            }
            System.out.print(matrix[i][startC]+" ");
        }
        startR++;
        startC++;
        endR--;
        endC--;
    }
    }
        
    public static void main(String args[]){
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        // 1  2  3  4
        // 5  6  7  8
        // 9 10 11 12
        // 13 14 15 16 
        spiral_M(matrix);
    }
}
