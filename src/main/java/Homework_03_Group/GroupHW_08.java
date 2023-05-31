package Homework_03_Group;

/*Maximum and minimum number in the array?*/
public class GroupHW_08 {
    public static void main(String[] args) {
        int[][] array = {{15, 4, 58, 65},
                {22, 14, 25, 89},
                {12, 45, 129, 36},
                {11, 13, 34, 45}};
        int lowest = array[0][0];
        int highest = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] < lowest) {
                    lowest = array[i][j];
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] > highest) {
                    highest = array[i][j];
                }
            }
        }
        System.out.println("Minimum is " + lowest + " and maximum is " + highest);
    }
}