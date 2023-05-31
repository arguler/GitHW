package Homework_03_Group;
/*Write a program to swap 2 numbers without a
temporary variable?*/
public class GroupHW_05 {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("Before swap");
        System.out.print("a = "+a+", b = "+b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("\nAfter swap" );
        System.out.print("a = " + a + ", b = " + b);
    }
}
