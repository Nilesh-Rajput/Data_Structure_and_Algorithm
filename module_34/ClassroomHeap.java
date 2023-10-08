package module_34;

import java.util.*;

public class ClassroomHeap {
    public static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
            arr.add(data);

            int x = arr.size()-1; // child idx
            int par = (x-1)/2; // parent idx

            while(arr.get(x)<arr.get(par)){ //O(log n)
                //swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x-1)/2;
            }
        }
        public int peek(){
            return arr.get(0);
        }

        private void heapify(int i){
            int left = 2*i+1;
            int right = 2*i+2;
            int min = i;

            if(left<arr.size() && arr.get(min) > arr.get(left)){
                min = left;
            }
            if(right<arr.size() && arr.get(min) > arr.get(right)){
                min = right;
            }
            if(min!=i){
                //swap
                int temp = arr.get(i);
                arr.set(i, arr.get(min));
                arr.set(min, temp);

                heapify(min);
            }
        }
        public int remove(){
            int data = arr.get(0);

            //step1- swap first and last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            //Delete Last
            arr.remove(arr.size()-1);

            //heapify
            heapify(0);
            return data;
        }
        public boolean isEmpty(){
            return arr.size()==0;
        }

    }
    public static void main(String args[]){
        Heap h = new Heap();
        h.add(3);
        h.add(2);
        h.add(4);
        h.add(5);
        h.add(10);
        h.add(1);

        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }
    }
}
