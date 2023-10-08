package module_16;

//check number is power 2 or not
public class Bit_manipulation2 {
    public static boolean check2Power(int n){
        return (n & (n-1)) ==0;
        
    }
    //count number of 1 int number
    public static int countSetBits(int n){
        int count=0;
        while(n>0){
            if((n&1) != 0){
                count++;
            }
            n =n>>1;
        }
        return count;
    }
    public static void swapWithout_third(int x,int y){
        System.out.println("Before "+"x "+x+" "+"y "+ y); 
        x =x^y;
        y =x^y; 
        x =x^y;
        System.out.println("After x "+x+" "+"y "+y);
    }
    public static void main(String args[]){
        System.out.println(check2Power(4));
        System.out.println(check2Power(15));

        System.out.println(countSetBits(10));
        swapWithout_third(3, 4);
    }
}
