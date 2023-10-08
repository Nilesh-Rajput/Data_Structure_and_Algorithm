package module_24;

public class DoublyLL {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size =1;

    //Add first 
    public void addFirst(int data){
        Node newNode = new Node(data);
        //base
        if(head==null){
            head = tail = newNode;
            return;
        }
        size++;
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    //remove First
    public void removeFirst(){
        //Base
        if(head == null){
            System.out.println("List is empty");
        }
        size--;
        head = head.next;
        head.next.prev = null;

    }
    //add last
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.next = null;
        newNode.prev = tail;
        tail = newNode;
    }
    //remove last
    public void removeLast(){
        if(head == null){
            System.out.println("empty");
        }
        size--;
        tail.prev.next = null;
        tail = tail.prev;
    }
    //reverse th doubly list
    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;
    }
    //print List
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+ "<-->");
            temp =temp.next;
        }
        System.out.print("null");
        System.out.println();
    }


    public static void main(String args[]){
        DoublyLL L1 = new DoublyLL();
        L1.addFirst(5);
        L1.addFirst(4);
        L1.addFirst(3);
        L1.addFirst(2);
        L1.addFirst(1);
        L1.print();
        System.out.println(size);
        L1.removeFirst();
        L1.print();
        System.out.println(size);
        L1.addLast(6);
        L1.print();
        System.out.println(size);
        L1.removeLast();
        L1.print();
        System.out.println(size);
        L1.reverse();
        L1.print();
        System.out.println(size);
    }
}
