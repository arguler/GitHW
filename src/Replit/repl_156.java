package Replit;
/*
**For you to do:**
Create class A
declare variable int i=10;
Create class B  extends A
declare variable int i=20;
create a method to display value
of variable i from both classes
In Main Class create an object
of subclass and call method display
**Expected Output:**
20
10
 */
public class repl_156 {
    public static void main(String[] args) {
        B obj=new B();
        obj.print1();
    }
}
class A {
    int print(){
        int i=10;
        System.out.println(i);
        return i;
    }

}
class B extends A{
    int print1(){
        int i=20;
        System.out.println(i);
        super.print();
        return i;
    }

}