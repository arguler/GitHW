package Homework_08_GroupExercise;

//import static jdk.internal.icu.text.UTF16.charAt;

/*
Count the Number of Words in a String: Write a function to count the
number of words in a given string. Words are separated by spaces or
punctuation. For example, the input "Hello, world!" should return 2.
 */
public class hw_03 {

    public static void main(String[] args){
        String sentence="Hello, world!";
        int count=0;
        String compare="!.? ";
        for (int i = 0; i < (sentence.length()); i++) {
            for (int j = 0; j < (compare.length()); j++) {
                if (sentence.charAt(i)==compare.charAt (j) ) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
