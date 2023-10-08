package module_10;

public class AllPrime {

    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=n-1;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void print_Prime(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
            System.out.println(i+ " ");
            }
        }
        
    }
    public static void main(String args[]){
        print_Prime(20);
    }
}
