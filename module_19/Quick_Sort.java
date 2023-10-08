package module_19;

public class Quick_Sort {
    public static void quickSort(int arr[],int s,int e){
        //Base 
        if(s>=e){
            return;
        }
        //Last element Pivot 
        int pidx = partition(arr,s,e);
        quickSort(arr, s, pidx-1);
        quickSort(arr, pidx+1, e); 
    }

    public static int partition(int arr[],int s,int e){
        int pivot = arr[e];
        int i= s-1;  // make space for number smaller than pivot

        for(int j=s;j<e;j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[e] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[] = {6,3,9,8,2,5};
        quickSort(arr, 0, arr.length-1);
        printArray(arr);
    }
}
