package module_18;

public class Recursion {
    public static void print_n_to_1(int n){
        //Base Condition
        if(n==1){
            System.out.println(n+" ");
            return;
        }
        System.out.print(n+" ");
        print_n_to_1(n-1);
    }
    public static void printIncr(int n){
        //Base Condition
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printIncr(n-1);
        //System.out.print("---");
        System.out.print(n+" ");
    }

    public static int fact(int n){
        //Base
        if(n==0){
            return 1;
        }
        //int factorial = fact(n-1);
        int ans = n * fact(n-1);
        return ans;

    }
    public static void main(String args[]){
        print_n_to_1(10);
        printIncr(10);
        
    }
}
