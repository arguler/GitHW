package Replit;

/*
1. Complete the Dog.java class:
Create following class variables.
dogName, dogWeight, static dogBreed=Mutt;
For all methods and variables use proper naming convention.
Create constructor to initialize instance variables
2. In Main class Create 2 Objects of a Dog class and using
each object reference variable print details of objects.
**Expected Output:**
Tarzan Mutt 50.0
Lucy Mutt 10.0
 */
public class repl_145 {
    public static void main(String[] args) {
        repl_145_Dog obj = new repl_145_Dog();
        obj.dogqualification("Tarzan", 50);
        obj.display();
        repl_145_Dog obj1 = new repl_145_Dog();
        obj1.dogqualification("Lucy", 10);
        obj1.display();
    }
}