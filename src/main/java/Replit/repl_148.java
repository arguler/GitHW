package Replit;
/*
**In ShoppingStore class:**
Create variables as below.
- item, - price, - quantity
Create a constructor to initialize instance variables.
Create a method with name itemTotalPrice.
write a logic to calculate the total values of items in stock.
and print the result. return the total value.
**In Main Class.**
Create two Object of ShoppingStore and pass the parameters to Constructor.
then using each object call the method itemTotalPrice.
Store the returned value of each object.
Calculate sum of both object and print the result.
Output:
Blanket Total Value 99.98
Mattress Total Value 439.18
You purchased 539.16 Today
Assignment Goals: Clean Code, proper naming convention,
Choosing Variable Datatype,  This Keyword, Method Creation,
Mathematic Operations, method return types.
 */
public class repl_148 {
    public static void main(String[] args) {
        repl_148_ShoppingStore obj=new repl_148_ShoppingStore();
        obj.itemTotalPrice("Blanket", 99.98,1 );

        repl_148_ShoppingStore obj1=new repl_148_ShoppingStore();
        obj1.itemTotalPrice("Mattress", 439.18,1 );

        System.out.println("You purchased "+(obj.price+obj1.price)+" Today");
    }
}
