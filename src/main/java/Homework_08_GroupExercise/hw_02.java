package Homework_08_GroupExercise;

import java.util.Scanner;

/*
Check if a String is Palindrome: Determine whether a given
string is a palindrome, which means it reads the same forwards
and backward. For example, "madam" is a palindrome.
 */
public class hw_02 {
    private String palindrome;

    void palindromecheck(String palindrome) {
        this.palindrome = palindrome;
        String reversepalindrome = "";
        int pldrmLength = palindrome.length();
        for (int i = (pldrmLength - 1); i >= 0; i--) {
            reversepalindrome = reversepalindrome + palindrome.charAt(i);
        }
        if (palindrome.toLowerCase().equals(reversepalindrome.toLowerCase())) {
            System.out.println(palindrome + " is a Palindrome");
        } else {
            System.out.println(palindrome + " is not a Palindrome");
        }
    }

    public static void main(String[] args) {

        Scanner check = new Scanner(System.in);
        System.out.println("Please write a  word if it is a palindrome");
        String palindrome = check.nextLine();

        hw_02 obj = new hw_02();
        obj.palindromecheck(palindrome);
    }
}
