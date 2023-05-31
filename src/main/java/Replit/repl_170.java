package Replit;
/*
For you to do:
Overload 2 final instance methods:
Call them in main method
**Expected Output:**
Final method with boolean parameter
Final method with String parameter
*/
public class repl_170 {
    final boolean study(boolean abc) {
        if (abc=true){
        System.out.println("Final method with boolean parameter");}
        else {
            System.out.println(abc);}
return abc;
    }

    final String study(String abd) {
        System.out.println("Final method with "+abd+ " parameter");
        return null;
    }

    public static void main(String[] args) {
        repl_170 obj = new repl_170 ();
        obj.study(true);
        obj.study("String");
    }
}
