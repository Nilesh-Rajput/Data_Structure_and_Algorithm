package module_35;

import java.util.HashSet;

public class CountDist {
    public static void main(String args[]){

        int num[] = {4,3,4,5,6,7,75,4,33,2};
        HashSet<Integer> count = new HashSet<>();

        for(int i=0;i<num.length;i++){
            count.add(num[i]);
        }

        System.out.println(count);




    }
}
