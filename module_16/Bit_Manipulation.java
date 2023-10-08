package module_16;

public class Bit_Manipulation {
    
    public static void oddOReven(int num){
        if((num & 1)==0){
            System.out.println("Even");
        }else{
            System.out.println("odd");
        }
    }

    public static int getBit(int n,int i){
        int Bitmask = 1<<i;
        if((n & Bitmask)==0){
            return 0;
        }else{
            return 1;
        }

    }
    public static int setBit(int n,int i){
        int BitMask = 1<<i;
        return n | BitMask;
    }
    public static int clearBit(int n,int i){
        int BitMask = ~(1<<i);
        return n & BitMask;
    }
    public static int cleari_Bit(int n,int i){
        int Bitmask = (~0)<<i;
        return n & Bitmask;
    }
    public static int clearBit_Range(int n,int i,int j){
        int a = ((~0)<<(j+1));
        int b = (i<<i)-1;
        int bitmask = a| b;
        return n & bitmask;
    }
    public static void main(String args[]){
        //
        // System.out.println("5 & 6 "+ (5 & 6));

        // System.out.println(5 | 6);
        oddOReven(12);
        oddOReven(89);
        System.out.println(getBit(4, 1));
        System.out.println(setBit(10, 2));
        System.out.println(clearBit(10, 1));
        System.out.println(cleari_Bit(15, 2));

        System.out.println(clearBit_Range(10, 2, 4));
    }
}
