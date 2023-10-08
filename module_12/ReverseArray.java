package module_12;

//heere the space complexity is O(1) and time complxity is O(n)
public class ReverseArray {
    public static void reverseAr(int number[]){
        int first = 0,last = number.length-1;
        while(first<last){
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;

            first++;
            last--;
        }
    }
    public static void main(String args[]){
        int number[]= {2,4,6,8,10};

        reverseAr(number);
        for(int i =0;i<number.length;i++){
            System.out.print(number[i]+" ");
        }

    }
}
