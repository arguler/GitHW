package Homework_04;
/*Create  class Student that will have a method
getGrade. Your method should accept the score of a
student and return a grade:
        score > 90 - A
        score >80 - B
        score >70 - C
        score > 50 - D
        anything else - F
*/

import java.util.Scanner;

public class HWMEthods_04 {
    public void getGrade() {
        Scanner imp = new Scanner(System.in);
        System.out.println("What is your score?");
        int score = imp.nextInt();
        if (score > 90 && score <= 100) {
            System.out.println("Your grade is A");
        } else if (score > 80 && score <= 90) {
            System.out.println("Your grade is B");
        } else if (score > 70 && score <= 80) {
            System.out.println("Your grade is C");
        } else if (score > 50 && score <= 70) {
            System.out.println("Your grade is D");
        } else if (score > 0 && score <= 50) {
            System.out.println("Your grade is F");
        } else {
            System.out.println("Please enter a valid number (0-100)");
        }

    }

    public static void main(String[] args) {
        HWMEthods_04 obj = new HWMEthods_04(); {
            obj.getGrade();
        }
    }
}