abstract class car{//the class should be abstract to defone am abstarct class
    int maxspeed=20;// We cannnot create instances of abstarct class which means we cannot create objects
    abstract void accelerate();//only declared but not implemented. Th has no body;
    void show(){//An abstarct class can have concrete methods and abstarct classes no need to have abstract methods
         System.out.println("hello");
    }
    abstract void brake();
   
}
 class bmw extends car{//if we extends abstarct class and if it has a abstarct method then it should be overriden to reolsve the error
    void accelerate(){//if it has more than one one abstarct method then we should make the chils class as abstact method or overide all abstarct methods 
           System.out.println("BMW is accelerating");
    }
    void brake(){

    }
}
class bmw1 extends bmw{
    void brake(){
         System.out.println("Bmw1 is braking");
    }
    void accelerate(){
        System.out.println("BMW1 is accelerating");
 }
}
abstract class A{
        int a=10;
        void show1(){
            System.out.println(a+" "+"Hi i am a concrete method in abstract class");
        }
}
class B extends A{
    void show(){
        System.out.println(a);
    }
}
public class Abstraction_12 {
    public static void main(String[] args) {
    //   car c=new car();//This is not possible.. 
    bmw b=new bmw();
    b.accelerate();
    bmw1 b1=new bmw1();
    b1.accelerate();
    B n=new B();
    n.show();
    n.show1();
    }
}
