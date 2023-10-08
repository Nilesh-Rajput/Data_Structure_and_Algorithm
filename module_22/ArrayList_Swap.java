package module_22;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import module_12.ReverseArray;

public class ArrayList_Swap {
    public static void swap(ArrayList<Integer> list,int i,int j){
        // int temp = list.get(i);
        // list.set(i, list.get(j));
        // list.set(j, temp);
        
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        // int i=1;
        // int j= 2;
        System.out.println(list);
        // swap(list, i, j);
        // System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        //Comparator
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i=1;i<=5;i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }
        
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        System.out.println(mainList);
                


    }
}
