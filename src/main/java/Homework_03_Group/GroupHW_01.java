package Homework_03_Group;
/*Create a program that uses an array to store a list of
temperatures for a week, and then uses a loop to find
the highest and lowest temperature for the week. */
public class GroupHW_01 {
    public static void main(String[] args) {
        int[][] array = {{16, 19, 25, 20, 19, 23, 21}};
        int lowest=array[0][0];
        int highest=array[0][0];
        for (int i = 0; i < array[0].length; i++) {
            if (array[0][i] < lowest) {
                lowest = array[0][i];
            }
        }
        for (int i = 0; i < array[0].length; i++) {
            if (array[0][i] > highest) {
                highest = array[0][i];
            }
        }
        System.out.println("This week's lowest temperature is " + lowest + " and highest is " + highest);
    }
}

