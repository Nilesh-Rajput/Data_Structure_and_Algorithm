package module_35;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;



public class HashSetOper {
    public static void main(String args[]){
        
        HashSet<Integer> hs = new HashSet<>();

        //Add
        hs.add(3);
        hs.add(8);
        hs.add(5);
        System.out.println(hs);

        hs.contains(6);
        hs.contains(8);



        hs.remove(5);

        System.out.println(hs);


        System.out.println(hs.size());

        System.out.println(hs.isEmpty());

        hs.clear();

        System.out.println(hs);


        System.out.println("\n\n\n");


        HashSet<String> cities = new HashSet<>();

        cities.add("Mumbai");
        cities.add("Dehli");
        cities.add("Dhule");

        
        Iterator it = cities.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("\n\n\n");

        for (String city : cities) {
            System.out.println(city);
        }

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Mumbai");
        lhs.add("Dehli");
        lhs.add("Dhule");

        System.out.println(lhs);

        TreeSet<String> ts = new TreeSet<>();

        ts.add("Mayur");
        ts.add("Bhushan");
        ts.add("Swapnil");
        System.out.println(ts);

        

    }
}
