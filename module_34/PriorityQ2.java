package module_34;

//import java.util.Comparator;
import java.util.*;

public class PriorityQ2 {
    public class Student implements Comparable<Student>{
        String name;
        int rank;

        public Student(String name,int rank){
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }

    }
    public static void main(String args[]){
        PriorityQueue<Student> pq = new PriorityQueue<>();
        
        // Student s1 = new Student("E", 2);
        // pq.add(new Student("A", 4));
        // pq.add(new Student("B", 2));
        // pq.add(new Student("C", 10));
        // pq.add(new Student("D", 1));
        //pq.add(new Student("A", 4));

        while(!pq.isEmpty()){
            System.out.print(pq.peek()+" ");
            pq.remove();
        }
    }
}
