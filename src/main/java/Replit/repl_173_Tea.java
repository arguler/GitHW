package Replit;

/*
# Abstraction
Create a Super Class Tea that will have:
- instance variable teaType;
- constructor that will initialize
- unimplemented method addSugar(),
Create 2 subclasses of Tea as Lemon Tea and Chai Tea.
In main class create an object of 2 Child and assign
them to Parent reference type.
Execute method addSugar from both classes.
**Expected Output:**
For Lemon Tea we need 2 spoons of sugar
For Chai Tea we need 1 spoon of sugar
*/
public class repl_173_Tea {
    String teaType;

    repl_173_Tea abc(String teaType) {
        this.teaType = teaType;
        return null;
    }
    void addsugar(){

    }
    public static void main(String[] args) {
    Lemon_Tea obj= new Lemon_Tea() {
        @Override
        void addsugar() {
            System.out.println("For Lemon Tea we need 2 spoons of sugar");
        }
    };
    obj.addsugar();
    Chai_Tea obj1=new Chai_Tea() {
        @Override
        void addsugar() {
            System.out.println("For Chai Tea we need 1 spoon of sugar");
        }
    };
    obj1.addsugar();
    }

}
abstract class Lemon_Tea{
    abstract void addsugar();
}
abstract class Chai_Tea {
    abstract void addsugar();
}
