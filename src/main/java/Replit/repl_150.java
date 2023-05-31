package Replit;

/*
1. Create four classes (Person, Employee, Student, Retiree)
* Have properties
For Person: name(String), For Person: lastName(String), For Person: age(int)
For Employee: salary(int)
For Student: grade(int)
For Retiree: seniorActivity(String)
At Employee, Student, Retiree Class have a print method in each
that prints the properties in line as shown in the output
Create multilevel inheritance: Person --> Employee --> Student --> Retiree
From your Main class create objects of the Employee, Student and Retiree
classes and call the print method.
**Expected Output:**
Joe Smith 35 35000
Adam Smith 15 10
Frank Smith 15 tour
*/
public class repl_150 {
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.print("Joe", "Smith", 35, 35000);
        Student obj1 = new Student();
        obj1.print("Adam", "Smith", 15, 10);
        Retiree obj2 = new Retiree();
        obj2.print("Frank", "Smith", 15, "tour");
    }
}
class Person {
    String name, lastName;
    int age;
}
class Employee extends Person {
       int salary;
    void print(String name, String lastName, int age, int salary) {
        this.salary = salary;
        System.out.println(name + " " + lastName + " " + age + " " + salary);
    }
}
class Student extends Employee {
    int grade;
    void print(String name, String lastName, int age, int grade) {
        System.out.println(name + " " + lastName + " " + age + " " + grade);
    }
}
class Retiree extends Student {
    String seniorActivity;
    void print(String name, String lastName, int age, String seniorActivity) {
        this.seniorActivity = seniorActivity;
        System.out.println(name + " " + lastName + " " + age + " " + seniorActivity);
    }
}


