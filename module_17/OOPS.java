package module_17;
class Test{
    static int a =10;
    static int b;
    static void bChange(){
        b = a * 3;
    }
}
public class OOPS {
    public static void main(String args[]){
        Vehicle obj1 = new Car();
        obj1.print();
        Test t = new Test();
        t.bChange();
        System.out.println(Test.a+Test.b);       
    }
}
class Vehicle{
    void print(){
        System.out.println("Base Class");
    }
}
class Car extends Vehicle{
    void print1(){
        System.out.println("Derived Class");
    }
}
