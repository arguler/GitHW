package Homework_08_GroupExercise;
/*
Reverse a String: Write a function to reverse a given string. For
example, given the input "Hello", the output should be "olleH".
 */
public class hw_01 {
    void reverse() {
        String abc = "Hello", cba = "";
        char ch;
        for (int i = 0; i < abc.length(); i++) {
            ch = abc.charAt(i);
            cba = ch + cba;
        }
        System.out.println(cba);
    }
    public static void main(String[] args) {
        hw_01 obj=new hw_01();
        obj.reverse();
    }
}
