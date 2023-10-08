package module_25;

import java.util.*;

public class Bottom_Stack {
    public static void pushBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        //System.out.println("----");
        pushBottom(s, data);
        //System.out.println("***");
        s.push(top);
        //System.out.println(top+"----><");
    }
    public static void reverse_Stack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverse_Stack(s);
        pushBottom(s, top);
    }
    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());  
        }
    }
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        //printStack(s);
        reverse_Stack(s);
        printStack(s);
        
    }
}
