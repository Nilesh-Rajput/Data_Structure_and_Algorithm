package module_27;
import java.util.*;
public class Deque_Collection {
    static class Stack{
        static Deque<Integer> d = new LinkedList<>();

        public static boolean isEmpty(){
            return d.isEmpty();
        }
        public static void push(int data){
            d.addLast(data);
        }
        public static int pop(){
            if(d.isEmpty()){
                System.out.println("Empty");
                return -1;
            }
            return d.removeLast();
        }
        public static int peek(){
            if(d.isEmpty()){
                System.out.println("Empty");
                return -1;
            }
            return d.getLast();
        }
    }
    public static void main(String args[]){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
