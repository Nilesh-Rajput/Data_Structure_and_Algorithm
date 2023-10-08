package module_12;

public class BinarySearch {

    public static int binaryS(int num[],int k){
        int start = 0, end = num.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(num[mid]==k){
                return mid;
            }else if(num[mid]<k){
                start = mid;
            }else{
                end = mid;
            }
            
        }
        return -1;
    }
    public static void main(String argds[]){
        int number[] = {2,4,6,8,10,12,14};
        int key =10;

        if(binaryS(number, key)==-1){
            System.out.println("Not found");
        }else{
            System.out.println("Inde of Key "+ binaryS(number, key));
        }
    }
}
