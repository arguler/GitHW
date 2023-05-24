package Replit;
/*
# Abstraction
Create a Parent Class in which you will have 1
implemented method m2 and 1 unimplemented method m1
Make Main class to be a derived class from Parent.
In main method execute both methods
**Expected Output:**
Child class providing implementation
Parent class providing implementation
*/
public class repl_172 extends repl_172_Parent {
    public static void main(String[] args) {
        repl_172_Parent obj=new repl_172_Parent() {
            @Override
            void m2() {
                System.out.println("Child class providing implementation");
            }
        };
        obj.m1();
        obj.m2();
    }

    @Override
    void m2() {
        System.out.println("Child class providing implementation");
    }
}
