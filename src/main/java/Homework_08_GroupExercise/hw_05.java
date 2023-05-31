package Homework_08_GroupExercise;

import java.util.Scanner;

/*
Find the First Non-Repeating Character in a String: Given a string,
find and return the first non-repeating character. For example, in the
string "abracadabra", the first non-repeating character is 'c'.
 */
public class hw_05 {
    public static void main(String args[])
    {
        Scanner giris = new Scanner(System.in);
        System.out.println("Enter a string value: ");
        String word = giris.nextLine().toLowerCase();
        boolean ifnot = true;


        for(char i :word.toCharArray())
        {
            if (word.indexOf(i) == word.lastIndexOf(i))
            {
                System.out.println("The first non-repeating character is: "+ i);
                ifnot = false;
                break;
            }
        }
        if(ifnot)
            System.out.println("There is no non repeating character in input string");
    }
}
