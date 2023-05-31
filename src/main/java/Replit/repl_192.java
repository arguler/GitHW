package Replit;

import java.util.ArrayList;
import java.util.List;

/*
Create an Linked List that will store all prime numbers from 1 to 100
Step 1. Create a method that will identify wether number is prime or not
Step 2. Add all prime numbers into Linked List
Print Linked List:
**Expected Output:**
[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41,
43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]
 */
public class repl_192 {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>();

        for (int number = 2; number <= 100; number++) {
            int control = 0;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    control = 1;
                    break;
                }
            }
            if (control == 0) {
                l1.add(number);
            }
        }
        System.out.println(l1);
    }
}


