package Homework_08_GroupExercise;
/*
Check if Two Strings are Anagrams: Given two strings, determine if
they are anagrams, meaning they contain the same characters in a
different order. For example, "listen" and "silent" are anagrams.
 */

import java.util.Arrays;
import java.util.Scanner;

public class hw_04 {
    static int count=0;
    static int size=0;
    public static void main(String[] args) {
        Scanner firstword = new Scanner(System.in);
        System.out.println("Enter a string value: ");
        String word1 = firstword.nextLine().toLowerCase();
        char[] charArray = word1.toCharArray();
        Arrays.sort(charArray);

        Scanner secondword = new Scanner(System.in);
        System.out.println("Enter a new string value: ");
        String word2 = secondword.nextLine().toLowerCase();
        char[] charArray1 = word2.toCharArray();
        Arrays.sort(charArray1);
        System.out.println(new String(charArray));
        System.out.println(new String(charArray1));

        /*if (charArray == charArray1) {

        } */
        for (int i = 0; i < word1.length(); i++) {
            if (charArray[i] == charArray1[i]) {
                count++;
            }
        }
        size=charArray.length;
        if(count==size){
            System.out.println("Words are equal");
        }else {
            System.out.println("Words are not equal");
        }
    }
}