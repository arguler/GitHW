package Homework01;

/*Create 2D array of countries: north america countries, south america countries, europe countries,
 asian countries, african countries. Then print all values from that array using 2 different loops
and calculate how many total countries been stored.
 */
public class HW2DArray_06 {
    public static void main(String[] args) {
        String[][] countries = {{"USA", "Canada", "Mexico", "Haiti"},
                {"Brazil", "Argentina", "Venezuela", "Paraguay"},
                {"Italy", "Spain", "Belgium", "Portugal"},
                {"Kenya", "Tanzania", "Morocco", "Madagascar"},
        };
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(countries[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("***** Now starts while loop *****");
        int y = 0;
        while (y < 4) {
            System.out.print(countries[0][y]+" ");
            System.out.print(countries[1][y]+" ");
            System.out.print(countries[2][y]+" ");
            System.out.print(countries[3][y]+" ");
            y++;
            System.out.println();
        }
        int x=countries.length;
        int z=countries[0].length;
        int sum=x*z;
        System.out.println("***** Total elements of array in this program are "+sum+" *****");

    }
}