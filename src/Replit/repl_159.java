package Replit;

/*
Create 3 overloaded methods to perform subtraction of
2, 3 and 4 numbers
In main method execute all 3 methods to match the output:
Expected Output
40 (should come from subtracting 4 numbers)
30 (should come from subtracting 3 numbers)
20 (should come from subtracting 2 numbers)
*/
public class repl_159 {

    void subtraction(int a, int b) {
        int subtract = a - b;
        System.out.println(subtract);
    }

    void subtraction(int a, int b, int c) {
        int subtract = a - b - c;
        System.out.println(subtract);
    }

    void subtraction(int a, int b, int c, int d) {
        int subtract = a - b - c-d;
        System.out.println(subtract);
    }

    public static void main(String[] args) {
        repl_159 obj = new repl_159();
        obj.subtraction(100,60);
        obj.subtraction(120,50,40);
        obj.subtraction(160,60,30,50);
    }
}