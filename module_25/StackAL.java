package module_25;

import java.util.ArrayList;

public class StackAL {
    static class Stack{
        static ArrayList<Integer> s = new ArrayList<>();

        //isEmpty
        public boolean isEmpty(){
            return (s.size() == 0);
        }
        //push
        public void push(int data){
            s.add(data);
        }
        //pop
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int l = s.remove(s.size()-1);
            return l;
        }
        //peek
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return s.get(s.size()-1);
        }
    }
    public static void main(String args[]){
        
        Stack list = new Stack();
        list.push(1);
        list.push(2);
        list.push(3);

        while(!list.isEmpty()){
            System.out.println(list.peek());
            list.pop();
        }
    }
}
