package Homework_03_Group;
/*Write a Java Program to print the first 10 numbers of
Fibonacci series.*/
public class GroupHW_07 {
    public static void main(String[] args) {
        int num1=0, num2=1, num3;
        System.out.print(num1+" "+num2);//0 ve 1
        for (int i = 0; i < 8; i++) {
            num3=num1+num2;
            System.out.print(" "+num3);
            num1=num2;
            num2=num3;
        }

    }
}
