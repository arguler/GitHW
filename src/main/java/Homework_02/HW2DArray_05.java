package Homework_02;

/*Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
Develop a program which will identify/print the even numbers only.
 */
public class HW2DArray_05 {
    public static void main(String[] args) {
        int[][] matrix = {{11, 26, 23, 59},
                {22, 45, 89,80},
                {74, 9, 8,44}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if(matrix[i][j]%2==0){
                    System.out.println(matrix[i][j]);
                }
            }
        }
    }
}
