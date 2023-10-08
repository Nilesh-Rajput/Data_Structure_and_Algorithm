package module_14;

public class Digonal_Sum {
    public static int digonalS(int matrix[][]){
        int Sum = 0;
    //     for(int i=0;i<matrix.length;i++){
    //         for(int j=0;j<matrix.length;j++){
    //             if(i==j){
    //                 Sum += matrix[i][j];
    //             }else if(i+j==matrix.length-1){
    //                 Sum +=matrix[i][j];
    //             }
    //         }
    //     }
    //     return Sum;
        for(int i=0;i<matrix.length;i++){
            Sum += matrix[i][i];

            if(i!=matrix.length-1-i){
                Sum += matrix[i][matrix.length-i-1];
            }
        }
        return Sum;

    }


    public static void main(String args[]){
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        // 1  2  3  4
        // 5  6  7  8
        // 9 10 11 12
        // 13 14 15 16 
        System.out.println(digonalS(matrix));
    }
}
