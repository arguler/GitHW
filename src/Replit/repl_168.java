package Replit;

/*
For you to do:
Create an instance final method that will reverse
a String and return that new String
Call method from the main method
**Expected Output:**
olleh
 */
public class repl_168 {
    final void reverse() {
        String abc = "hello", cba = "";
        char ch;
        for (int i = 0; i < abc.length(); i++) {
            ch = abc.charAt(i); //extracts each character
            cba = ch + cba; //adds each character in front of the existing string
        }
        System.out.println(cba);
    }

    public static void main(String[] args) {
        repl_168 obj=new repl_168();
        obj.reverse();


    }
}

