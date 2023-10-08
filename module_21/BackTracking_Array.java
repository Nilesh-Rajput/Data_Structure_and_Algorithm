package module_21;

public class BackTracking_Array {
    public static void backTracking_A(int arr[],int i,int val){
        if(i==arr.length){
            printArray(arr);
            return;
        }
        //Recursion
        arr[i] = val;
        backTracking_A(arr, i+1, val+1);
        arr[i] = arr[i]-2; //BackTraacking Step
    }
   
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String arg[]){
        int a[] = new int[5];
        backTracking_A(a, 0, 1);
        System.out.println();
        printArray(a);
    }
}
