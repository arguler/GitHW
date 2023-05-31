package Replit;

import java.util.HashSet;

/*
Create a Set and and below values to it.
[third, first, second]
Print HashSet and then remove all the elements from Hashset and print it again.
**Expected Output:**
[third, first, second]
[]
*/
public class repl_196 {
    public static void main(String[] args) {
        HashSet<String> inputs=new HashSet<String>();
        inputs.add("third");
        inputs.add("first");
        inputs.add("second");
        System.out.println(inputs);
        inputs.removeAll(inputs);
        System.out.println(inputs);
    }
}
