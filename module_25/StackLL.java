package module_25;

public class StackLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Stack{
        public static Node head = null;

        //isEmpty
        public static boolean isEmpty(){
            return (head==null);
        }
        //push
        public void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        //pop
        public int pop(){
            if(head == null){
                System.out.println("Already Empty");
                return -1;
            }
            int d = head.data;
            head = head.next;
            return d;
            
        }
        //peek
        public int peek(){
            if(head == null){
                System.out.println("Already Empty");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String args[]){
        Stack list = new Stack();
        list.push(1);
        list.push(2);list.push(3);
        while(!list.isEmpty()){
            System.out.println(list.peek());
            list.pop();
        }
    }
}
