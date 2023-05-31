package Homework_03_Group;
/*Write a java program to check whether a given
number is prime or not?*/
import java.util.Scanner;
public class GroupHW_06 {
    public static void main(String[] args) {
        int number;
        int counter = 0;
        Scanner oku = new Scanner(System.in);
        System.out.println("Enter a number if it is prime or not?");
        number = oku.nextInt();
        for (int i = 2; i < number; i++) {
            if (number == 2) //if number is two it is prime
            {
            } else if (number % i == 0) //if number divided by i is zero it's not prime
            {
                counter++;
            }
        }
        if (counter == 0) // if counter is zero number is prime
        {
            System.out.println("Entered number is prime (" + number+")");
        } else
            System.out.println("Entered number is not prime (" + number+")");
    }
}