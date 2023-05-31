package Replit;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

/*
Create an array list to type String.
Add these values below to your arraylist
hi
yo
sup
yolo
boop
Remove 1, 3, 5 element from an array
print remained values one by one in one line
**Expected Output:**
yo yolo
*/
public class repl_187 {
    public static void main(String[] args) {
        ArrayList<String> nmbrs = new ArrayList<String>();
        nmbrs.add("hi");
        nmbrs.add("yo");
        nmbrs.add("sup");
        nmbrs.add("yolo");
        nmbrs.add("boop");
        nmbrs.remove(0);
        nmbrs.remove(1);
        nmbrs.remove(2);
        System.out.print(nmbrs.get(0) +" "+ nmbrs.get(1));
    }
}
