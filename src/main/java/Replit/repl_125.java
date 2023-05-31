package Replit;
/*
**For you to do:**

Declare a static variable **number** that will hold an integer value:
Access **number** from the main method and assign value to it.
Create an Object of the class, access **number** in a nonstatic way and assing value of 200.
Print out **number** using class name and using instance
 */
public class repl_125 {
    static int number;

    public static void main(String[] args) {
        repl_125.number=200;
        repl_125 obj=new repl_125();
        obj.number=200;
        System.out.println(number);
        System.out.println(repl_125.number);
    }

}
