package module_23;

import org.w3c.dom.html.HTMLAreaElement;

public class LinkedList {
    public static class Node{
        int data;
        Node next;

        //Constructor
        public Node(int data){
            this.data = data;
            this.next = null;
        }
        
    }
    public static Node head;

    static Node tail;
    public static int size=1;

    //Method
    //add first
    public void addFirst(int data){
        Node node = new Node(data);
        if(head==null){
            head = tail = node;
            return;
        }
        size++;
        node.next = head;
        head = node;
    }
        //add last
    public void addLast(int data){
        Node node = new Node(data);
        if(head==null){
            head = tail = node;
            return;
        }
        size++;
        tail.next = node;
        tail = node;
        node.next = null;
    }
    //Add at middle
    public void add(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        size++;
        Node newNode = new Node(data);
        Node temp = head;
        int i=0;

        while(i<idx-1){
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }
    public void removeFirst(){
        if(size==0){
            System.out.println("Empty");
            return;
        }else if(size==1){
            head = tail = null;
            size =0;
            return;
        }
        head = head.next;
        size--;
    }

    public void removelast(){
        if(size==0){
            System.out.println("Empty");
            return;
        }else if(size==1){
            head = tail = null;
            size =0;
            return;
        }
        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev = prev.next;

        }
        prev.next = null;
        tail = prev;
        size--;
    }
    public int itrSearch(int key){
        Node temp =head;
        int i=0;
        while(temp != null){
            if(temp.data==key){
                return i;
            }
            temp = temp.next;
            i++;

        }
        return -1;
    }
    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    //Recursive search
    public int rec_Search(int key){
        return helper(head, key);
    }
    //Reverse a LinkList 
    public void reverse(){
        Node prev =null;
        Node curr = tail = head;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev =curr;
            curr = next;
        }
        head = prev;
    }
    //Print Function O(n)
    public static void print(LinkedList l1){
        if(head==null){
            System.out.println("empty");
            return;
        }
        Node temp =head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println();
    }

    //To find the Palindrome 
    //midPoint
    //slow-fast approch
    public Node findMid(Node head){
        Node slow =head;
        Node fast = head;
        
        while(fast!=null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkPalindrome(){
        if(head==null || head.next==null){
            return true;
        }
        Node midNode = findMid(head);

        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev =curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }


    //Marge Sort in Linked List from Scratch
    public Node mergeSort(Node head){
        //Base
        if(head == null || head.next == null){
            return head;
        }
        //find mid
        Node mid = getMid(head);
        //left an right sort
        Node rightNode = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRIght = mergeSort(rightNode);



        //merge 
        return merge(newLeft,newRIght);

    }
    //mid
    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;// mid 
    }
    private Node merge(Node head1,Node head2){
        Node mergeLL =new Node(-1);
        Node temp = mergeLL;

        while(head1 != null && head2 != null ){
            if(head1.data<=head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2 != null){
            temp.next = head1;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergeLL.next;
    }
    public void zigZag(){
        //find mid
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

        }
        Node mid = slow;

        //reverse 
        Node curr = mid.next;
        mid.next = null;
        Node prev =null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev =curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        //alt merge 
        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }


    }
    public static void main(String args[]){
        // LinkedList l1 = new LinkedList();
        
        // l1.addFirst(1);
        // l1.addLast(2);
        // l1.addLast(3);
        // l1.addLast(4);
        // l1.add(2, 9);
        // print(l1);
        // System.out.println();
        // System.out.println(l1.size);
        // System.out.println("----");
        // l1.removeFirst();
        // print(l1);
        // System.out.println(l1.size);
        // l1.removelast();
        // print(l1);
        // System.out.println(l1.size);
        // System.out.println(l1.itrSearch(3));
        // System.out.println(l1.itrSearch(8));
        //System.out.println(l1.rec_Search(3));
        // l1.reverse();
        // print(l1);
        LinkedList l2 = new LinkedList();
        l2.addFirst(5);
        l2.addLast(4);
        l2.addLast(3);
        l2.addLast(2);
        l2.addLast(1);

        //System.out.println(l2.checkPalindrome());
        // print(l2);
        // l2.mergeSort(l2.head);
        // System.out.println();
        print(l2);
        l2.zigZag();
        print(l2);
    }
    
}
