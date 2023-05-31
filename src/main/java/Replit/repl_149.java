package Replit;
/*
Create Three classes (Main, A, B):
Have a method that prints out the following
For A:  "Class A"
For B:  "Class B"
Make B extend A
From your Main class create an object of the B class and call the methods.
Output:
Class A
Class B
*/
public class repl_149 {
    public static void main(String[] args) {
        repl_148_A obj=new repl_148_A();
        obj.fromA();
        repl_148_B obj1=new repl_148_B();
        obj1.fromB();
    }
}
