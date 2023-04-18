/*Create 2D array of cars : american, german, korean, italian.
Then retrieve all values from that array using 2 different loops
 */
public class HW2DArray_02 {
    public static void main(String[] args) {
        String[][] cars = {{"american", "german", "korean", "italian"},
                {"ford", "porsche", "hyundai", "ferrari"}
        };
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(cars[i][j]);
            }
        }
        System.out.println("***** Now starts while loop *****");
        int y = 0;
        while (y < 4) {
            System.out.println(cars[0][y]);
            System.out.println(cars[1][y]);
            y++;
        }
    }
}
