package module_18;

public class Recursion2 {
    public static int fact(int n){
        //Base
        if(n==0){
            return 1;
        }
        //int factorial = fact(n-1);
        int ans = n * fact(n-1);
        return ans;
    }
    public static int sum(int n){
        //Base
        if(n==1){
            return 1;
        }
        int Sn = n + sum(n-1);
        return Sn;
    }

    public static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        int term = fibonacci(n-1)+fibonacci(n-2);
        return term;
        //exponential Time complexity O(2^n)

    }

    //check array is sorted or not
    public static boolean isSorted(int arr[],int i){
        if(arr[i]==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }

        return isSorted(arr, i+1);
    }

    //find the index of number first occurance
    public static int firstOccurance(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurance(arr, key, i+1);
    }

    //Last occurance of a number
    public static int lastOccourance(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound = lastOccourance(arr, key, i+1);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
    //calculate the x power n
    public static int Power(int x,int n){
        if(n==1){
            return x;
        }
        int ans = x * Power(x, n-1);
        return ans;
    }

    //optimized way of calculating power
    public static int optimizedPower(int x,int n){//O(log n)
        if(n==0){
            return 1;
        }
        int halfPOwer = optimizedPower(x, n/2);
        int halfPowerSqu = halfPOwer*halfPOwer;
        //odd power
        if(n%2 != 0){
            return x*halfPowerSqu;
        }
        return halfPowerSqu;
    }
    public static void main(String arg[]){
        System.out.println(fact(5));
        System.out.println(sum(5));
        System.out.println(fibonacci(25));
        int arr[] = {1,2,3,4,5,7,5};
        System.out.println(isSorted(arr, 0));

        System.out.println(firstOccurance(arr, 5, 0));

        System.out.println(lastOccourance(arr, 5, 0));

        System.out.println(Power(2, 3));

        System.out.println(optimizedPower(2, 5));
    }
}
