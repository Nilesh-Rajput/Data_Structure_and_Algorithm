package module_27;
import java.util.*;
public class Interleave_Queue { //O(n) Time Complexity & O(n) Space
    public static void inter_leaveQ(Queue<Integer> q){
        Queue<Integer> q1 = new LinkedList<>();
        int size = q.size();
        for(int i=1;i<=size/2;i++){
            q1.add(q.remove());
        }
        while(!q1.isEmpty()){
            q.add(q1.remove());
            q.add(q.remove());
        }
    }
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<=10;i++){
            q.add(i);
        }
        inter_leaveQ(q);
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }

    }
}
