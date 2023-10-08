package module_12;

import java.util.Currency;

public class MaxSumArray {

    public static void max_Sum_Array(int number[]){
        int curSum =0;
        int maxSum = Integer.MIN_VALUE;

        for (int i=0;i<number.length;i++){
            int start = i;
            for (int j=i;j<number.length;j++){
                int end =j;
                curSum = 0;
                for(int k=start;k<=end;k++){
                    curSum += number[k];
                }
                System.out.println(curSum);
                if(maxSum<curSum){
                    maxSum=curSum;
                }
            }
        }
        System.out.println("max sum "+ maxSum);
    }
    public static void main(String args[]){
        int number[] = {1,-2,3,-1,6};

        max_Sum_Array(number);

    }
}
