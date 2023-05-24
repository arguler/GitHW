package Replit;
/*
For you to do:
Overload instance method display by having different types of parameters
Inside each method write the logic to print value of the parameter
Call all methods inside your main method
**Expected Output:**
100
Syntax Technologies
100.09
 */
public class repl_160 {
    void add(int a, int b) {
        int toplam = a + b;
        System.out.println(toplam);
    }

    void add() {
        System.out.println("Syntax Technologies");
    }

    void add(double a, double b) {
        double toplam = a+b;
        System.out.println(toplam);
    }

    public static void main(String[] args) {
        repl_160 obj = new repl_160();
        obj.add(60, 40);
        obj.add();
        obj.add(90.00, 10.09);
    }
}
