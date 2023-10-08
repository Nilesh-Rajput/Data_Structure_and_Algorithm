package module_10;

public class BinToDec {


    public static void binTodecimal(int binNum){
        
        int myNum = binNum;
        int pow =0;
        int decNum = 0;

        while(binNum>0){
            int lastdigit = binNum % 10;
            decNum += (lastdigit * Math.pow(2, pow));
            pow++;

            binNum=binNum/10;
        }
        System.out.println("Decimal of "+ myNum +"= "+ decNum);

    }
    public static void decToBin(int n){
        int mynum =n;
        int pow =0;
        int binNum=0;

        while(n>0){
            int rem = n%2;
            binNum =binNum + (rem * (int)Math.pow(10, pow));
            pow++;
            n=n/2;
        }
        System.out.println("binary form is "+ mynum+"="+binNum);

    }
    public static void main(String args[]){
       // binTodecimal(101);
       decToBin(7);
    }
}
