package Homework_05;

/*
Create a method that will accept a String as a parameter and
return a new String that consist only of vowels. Method should be
 available inside the class only where it was declared and
 executed by calling it is name.
 */
public class Task2 {
    static String vowels(String s) {
        String vow = "aeiou";
        String a="";
        for (int i = 0; i < (s.length()-1); i++) {
            for (int j = 0; j < vow.length(); j++) {
                if (s.charAt(i) == vow.charAt(j)) {
                    a= a + vow.charAt(j);
                }
            }
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println(vowels("hello world i love you sooooo much"));
    }
}