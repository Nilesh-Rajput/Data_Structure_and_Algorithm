package module_13;

import java.util.random.RandomGenerator.LeapableGenerator;

public class BubbleSort {
    public static void bubbleSorting(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for (int j=0;j<n-1-i;j++){
                //swap
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    //timeComplexity is O(n2)
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int minPos = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]>arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[i];
            arr[i] =arr[minPos];
            arr[minPos] = temp;
        }
    }
    
    //insertion Sort timecomplexity O(n2)
    public static void insertion_Sort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            //finding out the correct positon to insert
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }
    }

    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        //sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j] =i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {2,3,4,5,6,1,3,7};
        //bubbleSorting(arr);
        //printArr(arr);
        System.out.println();
        //selectionSort(arr);
        //printArr(arr);
        //insertion_Sort(arr);
        //printArr(arr);
        countingSort(arr);
        printArr(arr);
    }
}
