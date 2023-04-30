package Homework_04;

import java.util.Scanner;
/*
Write a method to return whether given number
is prime or not?
 */
public class HWMethods_03 {
    public void primecheck() {
        int number;
        int counter = 0;
        Scanner oku = new Scanner(System.in);
        System.out.println("Enter a number if it is prime or not?");
        number = oku.nextInt();
        for (int i = 2; i < number; i++) {
            if (number == 2) { //if number is two it is prime
            }   else if (number % i == 0) //if number divided by i is zero it's not prime
            {
                counter++;
            }
        }
        if (counter == 0) // if counter is zero number is prime
        {
            System.out.println("Entered number is prime (" + number + ")");
        } else
            System.out.println("Entered number is not prime (" + number + ")");
    }

    public static void main(String[] args) {
        HWMethods_03 obj = new HWMethods_03();
        obj.primecheck();
    }
}
