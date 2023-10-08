package module_27;
import java.util.*;
public class Stack2_Queue {
    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();
        
        //isEmpty
        public static boolean isEmpty(){
            return s1.isEmpty();
        }
        //add O(n) tc
        public static void add(int data){
            if(isEmpty()){
                s1.add(data);
                return;
            }
            s2.add(s1.pop());
            add(data);
            s1.add(s2.pop());
            // while(!s1.isEmpty()){
            //     s2.push(s1.pop());
            // }
            // s1.add(data);
            // while(!s2.isEmpty()){
            //     s1.push(s2.pop());
            // }

        }
        //remove
        public static int remove(){
            if(s1.isEmpty()){
                System.out.println("empty");
                return -1;
            }
            int d = s1.pop();
            return d;
        }
        //peek
        public static int peek(){
            if(s1.isEmpty()){
                System.out.println("empty");
                return -1;
            }
            return s1.peek();
        }
    }

    
    public static void main(String args[]){
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(5);
        // System.out.println(q.peek());
        // System.out.println(q.remove());
        // System.out.println(q.peek());
        // q.add(5);
        // System.out.println(q.peek());
        // System.out.println(q.remove());
        // System.out.println(q.peek());
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
