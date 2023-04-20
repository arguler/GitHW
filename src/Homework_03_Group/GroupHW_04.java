package Homework_03_Group;
/*Create a 2D array of integers. Develop a program
which will calculate the sum of even and odd numbers
for that array.*/
public class GroupHW_04 {
    public static void main(String[] args) {
        int[][] dizi = {{15, 4, 58, 65},
                {22, 14, 25, 89},
                {12, 45, 21, 36},
                {11, 13, 34, 45}};
        int sumeven=0, sumodd=0;
        System.out.print("The sum of even numbers: ");
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[0].length; j++) {
                if (dizi[i][j] % 2 == 0) {
                    sumeven=sumeven+dizi[i][j];
                }
            }
        }
        System.out.print(sumeven + "\n");
        System.out.print("The sum of odd numbers: ");
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[0].length; j++) {
                if (dizi[i][j] % 2 != 0) {
                    sumodd=sumodd+dizi[i][j];
                }
            }
        }
        System.out.print(sumodd + " ");
    }
}
