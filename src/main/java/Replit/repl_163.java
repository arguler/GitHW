package Replit;
/*
In Parent Class create a method with name method() that will
print "Parent method" Override method() in Child class that
will print "Child method" In Main Class create objects of child
and parent class and call its method.
**Expected Output:**
Parent method
Child method
*/
public class repl_163 {
    public static void main(String[] args) {
        repl_163_Parent obj = new repl_163_Parent();
        obj.method();
        repl_163_Child obj1 = new repl_163_Child();
        obj1.method();
    }
}
