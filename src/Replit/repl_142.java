package Replit;
/*
**1. Complete the SyntaxTechnologies class:**
Include the following class variables:
* schoolName(String), * batch(int), * year(int), * lastDayOfClass(String)
Write two constructors:
* non-argument constructor
* parameterized constructor
Create method to display values of instance variables.
**2. In Main Class:**
Create two different objects of the SyntaxTechnologies
class using both constructors and call display method.
**Expected Output:**
null 0 0 null
Syntax 6 2020 07/30/2020
 */

public class repl_142 {
    String schoolname;
    int batch;
    int year;
    String lastDayOfClass;
    void printnull(){
        System.out.println(schoolname+" "+batch+" "+year+" "+ lastDayOfClass);
    }
    void sendparam(String s, int b, int y, String d){
        this.schoolname=s;
        this.batch=b;
        this.year=y;
        this.lastDayOfClass=d;
        System.out.println(schoolname+" "+batch+" "+year+" "+ lastDayOfClass);
    }
    public static void main(String[] args) {
        repl_142 obj=new repl_142();
        obj.printnull();
        repl_142 obj1=new repl_142();
        obj1.sendparam("Syntax",6, 2020, "07/30/2020");
    }

}
