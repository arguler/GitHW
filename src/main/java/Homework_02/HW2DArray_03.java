package Homework_02;

/*Using 2D array create a grocery list. Inside you should have an array of veggies,
fruits, dairy and sweets. Retrieve all values from that array using 2 different loops
*/
public class HW2DArray_03 {
    public static void main(String[] args){
        String[][] veggie={{"tomato", "potato", "carrot", "celery"},
                            {"cherry", "apple", "banana", "strawberry"}};
        for (int row = 0; row < veggie.length; row++) {
            for (int col = 0; col < veggie[row].length; col++) {
                System.out.print(veggie[row][col] + " ");
            }
            System.out.println();
        }
         double x=0; int y=0;
        do{
            System.out.println(veggie[0][y]+" ");
            System.out.println(veggie[1][y]+" ");
            y++;
        }while(y<4);
    }
}
