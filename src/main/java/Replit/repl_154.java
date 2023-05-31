package Replit;

/*
In Parent Class.
Create a no-argument constructor and include
the logic to print "Parent Constructor without argument"
Create another constructor that takes one parameter
of integer type called number. include the logic to print
the value of the number.
In Child class.
Create a Constructor without parameter and include the logic
to print "Child Constructor without argument"
Overload the constructor by adding one parameter of type integer
Inside the constructor call the parameterized parent class constructor.
In Main Class.
Create an object of Child without passing any argument.
And then another object of Child class by passing the value "10".
run the application.
**Expected Output:**
Parent Constructor without argument
Child Constructor without argument
10
 */
public class repl_154 {
    public static void main(String[] args) {
        repl_154_Child obj=new repl_154_Child();
        obj.repl_154_Child();
    }
}

class repl_154_Parent {
    String noargument() {
        System.out.println("Parent Constructor without argument");
        return null;
    }

    int number(int number) {
        System.out.println(number);
        return number;
    }
}

class repl_154_Child extends repl_154_Parent {
    String repl_154_Child() {
        super.noargument();
        System.out.println("Child Constructor without argument");
        super.number(10);
        return null;
    }
}
