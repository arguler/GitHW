package Replit;
/*
Create an Interface with name as MyInterface
Create two undefined methods method1 and method2
Inherit the MyInterface to Main Class.
Execute both methods
**Expected Output:**
implementation of method1
implementation of method2
 */
public class repl_174_Main {
    public static void main(String[] args) {
        repl_174_MyInterface obj=new repl_174_MyInterface() {
            @Override
            public void method1() {
                System.out.println("implementation of method1");
            }

            @Override
            public void method2() {
                System.out.println("implementation of method2");

            }
        };
        obj.method1();
        obj.method2();
    }
}
