package module_18;

public class Recursion4 {
    // print indices of key occurances
    public static void printOccurance(int arr[],int k,int idx){
        if(idx == arr.length){
            return;
        }
        if(arr[idx] == k){
            System.out.print(idx+" ");
        }
        printOccurance(arr, k, idx+1);
    }
    // print Digit to String like 2023 is two zero two three
    static String digit[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void printDigit(int n){
        if(n==0){
            return;
        }
        int lastDigit = n%10;
        printDigit(n/10);
        System.out.print(digit[lastDigit]+" ");
    }

    //Lenght of the String
    // public static int lenghtString(String str){
        
    // }
    public static void main(String args[]){
        int arr[] = {3,2,4,5,6,2,7,2,2};
        printOccurance(arr, 2, 0);
        printDigit(2023);
    }
}
