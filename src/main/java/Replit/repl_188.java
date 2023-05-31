package Replit;

import java.util.ArrayList;
import java.util.Scanner;

/*
Using Scanner class add 5 elements into ArrayList and then print
all elements from that ArrayList all in 1 line

Numbers in:
4
62
8
5
4
**Expected Output:**
4 62 8 5 4
 */
public class repl_188 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<Integer> numbers=new ArrayList<>();
        for (int i = 0; i <5 ; i++) {
            System.out.println("Enter number: ");
            numbers.add(input.nextInt());
        }
        for (int i = 0; i <5 ; i++) {
            System.out.print(numbers.get(i)+" ");
        }
    }
}
