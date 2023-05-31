package Homework_03_Group;
/*Create an array of integer values. After the array is
created, calculate the sum of all stored elements in
that array.*/
public class GroupHW_02 {
    public static void main(String[] args) {
        int[][] dizi = {{15, 4, 58, 65},
                {22, 14, 25, 89},
                {12, 45, 21, 36},
                {11, 13, 34, 45}};
        int sum=0;
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[0].length; j++) {
                sum=sum+dizi[i][j];
            }
        }
        System.out.println("Total= "+sum);
    }
}
