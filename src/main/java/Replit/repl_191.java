package Replit;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

/*
Create an ArrayList of type boolean called listA and add below values
(true, false, false)
Create another array list call listB and add all values from listA
into it
Using iterator print all values from ListB 1 by 1
**Expected Output:**
true
false
false
*/
public class repl_191 {
    public static void main(String[] args) {
        ArrayList<Boolean> listA=new ArrayList<Boolean>();
        listA.add(true);
        listA.add(false);
        listA.add(false);

//        System.out.println(listA);

        ArrayList<Boolean> listB=new ArrayList<Boolean>();
        listB.addAll(listA);
//        System.out.println((listB));

        for(Boolean value:listB){
        System.out.println(value);}


    }
}
