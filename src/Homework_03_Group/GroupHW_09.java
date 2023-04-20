package Homework_03_Group;

/*Write a java program to find the second largest
number in the array?*/
public class GroupHW_09 {
    public static void main(String[] args) {
        int[][] array = {{15, 4, 58, 65},
                {22, 14, 25, 89},
                {12, 45, 129, 36},
                {11, 13, 34, 45}};
        int[][] siralama = new int[1][16];
        // int lowest = array[0][0];
        int sira = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] > sira) {
                    sira = array[i][j];
                } else if (array[i][j] < sira) {
                    i = i - 1;
                    for (int k = 0; k < 16; k++) {
                        siralama[0][k] = sira;
                        System.out.println(siralama[0][k]);
                    }
                }
            }

        }
    }
    //System.out.println("Minimum is  "+/*lowest*/  " and maximum is " + highest);
}

