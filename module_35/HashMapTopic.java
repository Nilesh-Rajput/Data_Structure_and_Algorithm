package module_35;

import java.util.HashMap;
import java.util.Set;

public class HashMapTopic {
    
    public static void main(String args[]){

        HashMap<String, Integer> hm = new HashMap<>();

        //add
        hm.put("India", 100);
        hm.put("China", 120);
        hm.put("US", 30);

        // //get
        // int population = hm.get("US");
        // System.out.println(population);

        // //ContainsKeys
        // System.out.println(hm.containsKey("US"));
        // System.out.println(hm.containsKey("hm"));

        // //remove
        // hm.remove("China");

        // //isEmpty
        // System.out.println(hm.isEmpty());

        // hm.clear();

        // System.out.println(hm.isEmpty());

        // //size
        // System.out.println(hm.size());

        //Iteration in HashMap
        Set<String> keys = hm.keySet();

        for (String k : keys) {
            System.out.println("key - "+k+ ",value -"+hm.get(k));
        }
    }

}
 