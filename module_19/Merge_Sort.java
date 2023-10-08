package module_19;

public class Merge_Sort {
    public static void mergeSort(int arr[],int s,int e){
        //base Case
        if(s >= e){
            return;
        }
        //work
        int mid = s + (e-s)/2; // (s + e)/2
        //left half
        mergeSort(arr, s, mid);
        //right half
        mergeSort(arr, mid+1, e);

        //merge both 
        merge(arr, s, mid, e);

    }

    //merge function
    public static void merge(int arr[],int s,int mid,int e){
        int temp[] = new int[e-s+1];
        int i = s;
        int j = mid+1;
        int k = 0;

        while(i<=mid && j<=e){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //for left side is more 
        while(i<=mid){
            temp[k] = arr[i];
            k++;
            i++;
        }

        //for right side is more
        while(j<=e){
            temp[k] = arr[j];
            k++; j++;
        }

        //copy the temp into original 
        for(k=0,i=s;k<temp.length;k++,i++){
            arr[i] = temp[k];

        }
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String args[]){
        int arr[] = {6,3,9,5,2,8};
        mergeSort(arr, 0, arr.length-1);
        printArray(arr);

    }
}
