package Replit;
/*
 1. Complete the Car.java class:
Create the following variable (**Choose proper datatype**)
* make, * model, * numberOfDoors, * topSpeed, * price
following the proper naming convention for variables.
Write four constructors:
* The first constructor(with all parameters)
* A secondary constructor Have all parameters **except numberOfDoors.
(**numberOfDoors value should assign to 4 inside constructor)
* A third constructor Have all parameters **except make and model .
** **(**make and model value should assign to "unknown" inside constructor)
* A fourth constructor Have all parameters **except topSpeed and price**;
**(**topSpeed value should assign to "90" and price value should be assign
to 0 inside constructor)
Create a display method in Cars class to print the class variable value in console.
2. Test your code with the Main.java class:
Create several Car objects using all Constructors.
then call display method with each object.
Output:
Toyota Prius 4 120 30000.0
Toyota Prius 4 120 30000.0
unknown unknown 4 120 30000.0
Toyota Prius 4 90 0.0
*/
public class repl_143 {
        public static void main(String[] args) {
            repl_143_cartester obj = new repl_143_cartester();
        obj.showall("Toyota", "Prius", 4, 120, 30000);
            repl_143_cartester obj1 = new repl_143_cartester();
        obj1.showexceptone("Toyota", "Prius", 120, 30000);
            repl_143_cartester obj2 = new repl_143_cartester();
        obj2.showexcepttwo(4, 120, 30000);
            repl_143_cartester obj3 = new repl_143_cartester();
        obj2.showexceptthree("Toyota", "Prius", 4);
    }
}