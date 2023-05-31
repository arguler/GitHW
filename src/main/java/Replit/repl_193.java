package Replit;

import java.util.ArrayList;
import java.util.List;

/*
Create Linked List that will store Integer Objects
Add the values below:
111
222
333
444
555
666
Create a logic to calculate sum of the all the values in list.
Print the result of sum.
**Expected Output:**
Result of sum is 2331 */
public class repl_193 {
    public static void main(String[] args) {
        int sum=0;
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(111);
        l1.add(222);
        l1.add(333);
        l1.add(444);
        l1.add(555);
        l1.add(666);
        for (int i = 0; i < 6; i++) {
            sum=sum+l1.get(i);
        }
        System.out.println("Result of sum is "+sum);
    }
}
