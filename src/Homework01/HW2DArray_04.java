/*Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
Print the sum of all numbers.*/
public class HW2DArray_04 {
    public static void main(String[] args) {
        int[][] matrix = {{11, 5, 23},
                {22, 45, 89},
                {74, 9, 8}};
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum = sum + matrix[i][j];
            }
        }
        System.out.println(sum);
    }
}
