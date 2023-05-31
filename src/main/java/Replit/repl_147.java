package Replit;
/*
**In carObject class:**
Create instance variables as below.
- model
- price,
- quantity
Create a constructor that will initialize instance variables.
Create a method with name carStockValue. Write logic to calculate
the total values of cars in stock and print the result.
run the application in Main Class
**Expected Output:**
Toyota 2019 Stock Value 2500000.0
BMW 2019 Stock Value 652980.0
Assignment Goal. Clean Code, This Keyword, Method Creation,
Mathematic Operations.
 */
public class repl_147 {
    public static void main(String[] args) {
        repl_147_CarObjects obj = new repl_147_CarObjects();
        obj.carStockValue("Toyota", 2019, 100, 25000);

        repl_147_CarObjects obj1 = new repl_147_CarObjects();
        obj.carStockValue("BMW", 2019, 20, 32349);

    }
}
