package Replit;
/*
Overload static method and then execute both overloaded methods.
**Expected Output:**
static method without parameter
static method with int parameter
 */
public class repl_162 {
    static void a () {
        System.out.println("static method without parameter");
    }

    static void a (int a, int b) {
        System.out.println("static method with int parameter");
    }

    public static void main(String[] args) {
        repl_162 obj = new repl_162();
        obj.a();
        obj.a(10, 11);
    }


}
