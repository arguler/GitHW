package Replit;
/*
1. Complete the Employee.java class:
Include the following class variables:
* name(String), * lastName(String), * employeeId(int)
* startDate(String), * salary(int), Write two constructors:
* non-argument constructor, * parameterized constructor that will
initialize all instance variables, Create two different objects of
the Employee class using both constructors and print the values of
the properties inline using a print method.
Output:
null null 0 null 0
Joe Smith 12345 01/01/1970 35000
 */
public class repl_146 {
    public static void main(String[] args) {
        repl_146_Employee obj = new repl_146_Employee();
        obj.sendno();

        repl_146_Employee obj1 = new repl_146_Employee();
        obj1.sendall("joe","Smith",12345, "01/01/1970", 35000);
        obj1.sendno();
    }
}

