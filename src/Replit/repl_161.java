package Replit;
/*
Overload private instance method m1
Call each method from the main method.
Expected Output:
private m1 method
private m1 method with int parameter
 */
public class repl_161 {
    private void m1() {
        System.out.println("private m1 method");
    }

    private void m1 (int a, int b) {
        System.out.println("private m1 method with int parameter");
    }

    public static void main(String[] args) {
        repl_161 obj = new repl_161();
        obj.m1();
        obj.m1(10, 11);
    }

}
