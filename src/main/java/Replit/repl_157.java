package Replit;

/*
Create a Parent class
create  instance method  m1 saying "m1 method in parent class"
Create a Child class that will be a derived class from Parent
Create same instance method m1 saying "m1 method in child class"
Create another method m2 in child class and inside that method
call method m1 from child class and method m1 from parents class
in Main class. Create and object of child class and call m2 method
**Expected Output:**
m1 method in child class
m1 method in parent class
 */
public class repl_157 {
    public static void main(String[] args) {
        Child1 obj = new Child1();
        obj.m2();

    }
}

class Parent1 {
    String m1() {
        System.out.println("m1 method in parent class");
        return null;
    }
}

class Child1 extends Parent1 {
    String m1() {
        System.out.println("m1 method in child class");
        return null;

    }

    String m2() {
        Child1 obj = new Child1();
        obj.m1();
        super.m1();
        return null;

    }
}