package module_19;

public class dividenConquor {
    //Search in rotated sorted array...
    public static int search(int arr[],int key,int s,int e){
        //Base
        if(s>e){
            return -1;
        }
        //mid 
        int mid = s+(e-s)/2;
        if(arr[mid] == key){
            return mid;
        }
        if(arr[s] <= arr[mid]){
            //case 1
            if(arr[s] <= key && key <= arr[mid]){
                return search(arr, key, s, mid-1);
            }else{
                //case 2
                return search(arr, key, mid+1, e);
            }
        }else{
            if(arr[mid]<=key && key <= arr[e]){
                return search(arr, key, mid+1, e);
            }else{
                return search(arr, key, s, mid-1);
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {4,5,6,7,0,1,2};
        System.out.println(search(arr, 1, 0, arr.length-1));
    }
}
