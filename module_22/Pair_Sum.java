package module_22;

import java.util.ArrayList;

public class Pair_Sum {
    public static boolean p_Sum(ArrayList<Integer> list,int target){
        int i=0;
        int j= list.size()-1;
        while(i<j){
            if(list.get(i)+list.get(j)==target){
                return true;
            }else if(list.get(i)+list.get(j)<target){
                i++;
            }else{
                j--;
            }
        }
        return false;
    }

    //Rotated ArrayList Pair sum
    public static boolean p2_Sum(ArrayList<Integer> list,int target){
        //Braking point
        int bp =-1;
        int n= list.size();
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                bp =i;
                break;
            }
        }
        int lp = bp+1;
        int rp = bp;
        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }else if(list.get(lp)+list.get(rp)<target){
                lp = (lp+1)%n;
            }else{
                rp =(n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(p_Sum(list, 5));

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(11);
        list2.add(15);
        list2.add(6);
        list2.add(8);
        list2.add(9);
        list2.add(10);
        System.out.println(p2_Sum(list2, 16));


    }
}
