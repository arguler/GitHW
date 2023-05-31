package Replit;

import java.util.ArrayList;

/*
# ArrayList Loop
Create an arrayList of type Integer.
add below values.
111
111
111
999
999
999
Print all the values of List 1 by 1:
**Expected Output:**
111
111
111
999
999
999
*/
public class repl_185 {
    public static void main(String[] args) {
        ArrayList<Integer> nmbrs = new ArrayList<Integer>();
        nmbrs.add(111);
        nmbrs.add(111);
        nmbrs.add(111);
        nmbrs.add(999);
        nmbrs.add(999);
        nmbrs.add(999);
        for (int i = 0; i < nmbrs.size(); i++) {
            System.out.println(nmbrs.get(i));
        }
    }
}