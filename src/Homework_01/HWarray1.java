package Homework_01;
/* Create an array of chars and store grades into it: A,B,C,D.
Then print a grade B (use 2 different ways of creating an array). */
public class HWarray1 {
    public static void main(String[] args) {
        String [] letters=new String[4];
        letters[0]="A";
        letters[1]="B";
        letters[2]="C";
        letters[3]="D";

        System.out.println(letters[1]);
        System.out.println(letters[0]);
    }
}
