package module_12;

public class LargeArray {

    public static int largest_num(int number[]){
        int biggest = Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            if(biggest<number[i]){
                biggest = number[i];
            }
        }
        return biggest;
    }
    public static void main(String args[]){
        int number[] = {1,2,6,4,3};
        
        System.out.println("largest number is "+ largest_num(number));
    }
}
