package Homework_01;

/* Create an array of cars and store 6 elements into it.
Using 2 different loops print all values from the array.
 */
public class HWArray4 {
    public static void main(String[] args) {
        String[] cars = {"BMW", "Toyota", "Mercedes", "Mazda", "Ferrari", "Volkswagen"};
        for (int i = 0; i < 6; i++) {
            System.out.println(cars[i]);
        }
        System.out.println("*** I'am going to second loop. ***");
        int x = 0;
        while (x < 6) {
            if (x % 2 == 0) {
                System.out.println(cars[x]);
            }
            x++;
        }
    }
}
