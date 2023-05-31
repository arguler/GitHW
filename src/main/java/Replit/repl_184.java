package Replit;

import java.util.ArrayList;

/*
Create a array list that will hold Integer Objects:
Add below elements to it.
111
222
333
444
555
666
Print first, third and fifth element from your array
**Expected Output:**
111
333
555
*/
public class repl_184 {
    public static void main(String[] args) {
        ArrayList<Integer> nmbrs=new ArrayList<Integer>();
        nmbrs.add(111);
        nmbrs.add(222);
        nmbrs.add(333);
        nmbrs.add(444);
        nmbrs.add(555);
        nmbrs.add(666);
        System.out.println(nmbrs.get(0));
        System.out.println(nmbrs.get(2));
        System.out.println(nmbrs.get(4));
    }
}
