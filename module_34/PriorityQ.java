package module_34;
import java.util.*;
public class PriorityQ {
    public static void main(String args[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(3);
        pq.add(2);
        pq.add(7);
        pq.add(4);

        while(!pq.isEmpty()){
            System.out.print(pq.peek()+" ");
            pq.remove();
        }
    }
}
