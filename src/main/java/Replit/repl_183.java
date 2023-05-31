package Replit;

import java.util.ArrayList;

/*
# ArrayLists
Create an array list that will hold String Objects
Find out wether array list is empty or not.
Add String value "Syntax" to it
Find out wether array list is empty or not.
**Expected Output:**
true
false
*/
public class repl_183 {
    public static void main(String[] args) {
        ArrayList<String> objects = new ArrayList<String>();
        boolean ifempty=objects.isEmpty();
        System.out.println(ifempty);
        objects.add("Syntax");
        boolean ifempty1=objects.isEmpty();
        System.out.println(ifempty1);
    }
}
