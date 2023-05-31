package Replit;

import java.util.ArrayList;
import java.util.List;

/*
Create a Linked List that will store Integer Objects from 50-100.
Once Linked List is created remove all numbers that are not
divisible by 3.
Print Linked List
**Expected Output**
[51, 54, 57, 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99]
 */
public class repl_189 {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>();
        List<Integer> l2 = new ArrayList<Integer>();
        for (int i = 50; i < 101; i++) {
            l1.add(i);
        }
//        System.out.println(l1);
        for (int i = 0; i < l1.size(); i++) {
            if (l1.get(i) % 3 == 0) {
                int add=l1.get(i);
                l2.add(add);
            }
        }
        System.out.println(l2);
    }
}

