package Replit;

import org.w3c.dom.ls.LSOutput;

/*
In Parent class.
Create a constructor, it will take a String parameter called city.
include the logic of printing the parameter value.
Create another constructor without parameter.
Include the logic of printing "Parent Constructor".
Create a Child Class that should be a subclass of Parent class
Inside child class create a constructor that will make a call
to parameterized constructor of the parent class.
In Main class.
Create an Object of the child class by passing String value
"Vienna"
**Expected Output:**
Vienna
 */
public class repl_152 {
    public static void main(String[] args) {
        repl_152_Child obj = new repl_152_Child("Vienna");
    }
}
