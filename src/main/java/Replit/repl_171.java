package Replit;

/*
# Abstraction
Create a Parent Class that will have two overloaded
abstract methods m1
Make Main class as concrete subclass to Parent Class
In main method call the methods.
**Expected Output:**
m1 without parameters
m1 method with parameter
*/
public class repl_171 {
    public static void main(String[] args) {
        repl_171_Parent obj = new repl_171_Parent() {
            @Override
            void m1() {
                System.out.println("m1 without parameters");
            }

            @Override
            void m1(String m1) {
                System.out.println("m1 method with parameter");
            }
        };
        obj.m1();
        obj.m1("m1");
    }

}

abstract class repl_171_Parent extends repl_171 {
    abstract void m1();

    abstract void m1(String m1);
}