package module_8;
import java.util.*;

public class isPrime{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        boolean prime = true;

        if(n==2){
            System.out.println("n is Prime");
        }else{
            for(int i=2;i<=n-1;i++){
                if(n%i == 0){
                    prime = false;
    
                }
            }
    
            if(prime== true){
                System.out.println("n is Prime");
            }else{
                System.out.println("n is not Prime");
            }
        }

    }
}