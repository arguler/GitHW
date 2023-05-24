package Homework_06;

/*
Write a java Class Students that have a constructor which
takes students name and 3 subject grades. Inside your class
also have a method to Calculate Average Grade. Test Student
class for 5 different students with different marks. Your
program should print an average mark of each students name.
 */
public class Students {
    String name;
    double grade1, grade2, grade3;
    Students(String name, double grade1, double grade2, double grade3) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        System.out.println(this.name+"'s average grade is "+ (this.grade1 +
                this.grade2 + this.grade3) / 3);
    }
}
