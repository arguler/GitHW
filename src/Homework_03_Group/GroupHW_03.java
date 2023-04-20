package Homework_03_Group;

/*Create a 2D array or integer type where you will store
odd and even numbers. Develop a program which will
identify/print the even numbers only.*/
public class GroupHW_03 {
    public static void main(String[] args) {
        int[][] dizi = {{15, 4, 58, 65},
                {22, 14, 25, 89},
                {12, 45, 21, 36},
                {11, 13, 34, 45}};
        System.out.print("Even numbers: ");
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[0].length; j++) {
                if (dizi[i][j] % 2 == 0) {
                    System.out.print(dizi[i][j] + " ");
                }
            }
        }

    }
}
