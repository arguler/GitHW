package Replit;

import java.util.ArrayList;

/*
# ArrayList Remove
Create an Arraylist of type Integer.
Add below elements to it.
111
222
333
444
555
666
Print the ArrayList.
remove all the elements.
Print the Arraylist.
**Expected Output:**
[111, 222, 333, 444, 555, 666]
[]
*/
public class repl_186 {
    public static void main(String[] args) {
        ArrayList<Integer> nmbrs = new ArrayList<Integer>();
        nmbrs.add(111);
        nmbrs.add(222);
        nmbrs.add(333);
        nmbrs.add(444);
        nmbrs.add(555);
        nmbrs.add(666);
        System.out.println(nmbrs);
        for (int i = 0; i < nmbrs.size(); i=i) {
            nmbrs.remove(i);
        }
        System.out.println(nmbrs);
    }
}