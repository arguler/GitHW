package Homework_03_Group;

/*Write a java program to find the second largest
number in the array?*/
public class GroupHW_09 {
    public static void main(String[] args) {
        int[][] array = {{15, 4, 58, 65},
                {22, 14, 25, 135},
                {12, 45, 129, 36},
                {11, 13, 34, 45}};
        int largest = array[0][0];
        int secondLargest = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] > largest) {
                    largest = array[i][j];
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] < largest && secondLargest < array[i][j]) {
                    secondLargest = array[i][j];
                }
            }
        }
        System.out.println("Second largest number in array : " + secondLargest);
    }
}
