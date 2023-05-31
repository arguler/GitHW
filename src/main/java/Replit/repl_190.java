package Replit;

import java.util.ArrayList;
import java.util.List;

/*
Create Linked List that will store first 10 numbers
of fibonacci series
Print number from Linked List 1 by 1 all in 1 line
**Expected Output:**
0 1 1 2 3 5 8 13 21 34
 */
public class repl_190 {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>();
        int first = 0, second = 1, sum = 0;
        l1.add(0);
        l1.add(1);
        for (int i = 2; i < 10; i++) {
            sum = first + second;
            l1.add(sum);
            first = second;
            second = sum;
        }
        for (int i =l1.get(0) ; i <(l1.size()); i++) {
            System.out.print(l1.get(i)+" ");
        }
    }
}