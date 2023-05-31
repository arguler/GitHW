package Replit;
/*
Parent class create 4 methods with different level of access modifiers.
In each method print "I am parent public/protected/default/private method".
Override methods in child class.
In Main Class create object of the child class and see which methods
are available
**Expected Output:**
I am a child public method
I am a child protected method
I am a child default method
*/
public class repl_165 {
    public static void main(String[] args) {
        repl_165_Child obj=new repl_165_Child();
        obj.printfpublic();
        repl_165_Child obj1=new repl_165_Child();
        obj1.printfprotected();
        /*
        repl_165_Child obj2=new repl_165_Child();
        obj2.printfprivate();
         */

       // repl_165_Child obj3=new repl_165_Child();
        repl_165_Child.TestInterface.printdefault();
    }
}
