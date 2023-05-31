package Replit;

/*
In AnotherClass declare a private, default, protected, public methods
and have them each return the name of the what access modifier they are using.
All methods should be accessible by class name
Call methods of Another class inside Main class
**Expected Output:**
default
protected
public
 */
public class repl_138 {
    interface default_1 {
        default void show() {
            System.out.println("default");
        }
    }
    public static class Deftest implements default_1 {
    }

    protected void run() {
        System.out.println("protected");
    }

    public void keep() {
        System.out.println("public");

    }
}
class repl_138_1 {
    public static void main(String[] args) {
        repl_138.Deftest obj = new repl_138.Deftest();
        obj.show();
        repl_138 obj1 = new repl_138();
        obj1.run();
        repl_138 obj2 = new repl_138();
        obj2.keep();

    }
}
