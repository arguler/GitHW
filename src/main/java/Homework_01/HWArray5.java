package Homework_01;
/* Create an array of animals and store 5 elements into it.
Using 2 different loops print all elements from the array. */
public class HWArray5 {
    public static void main(String[] args) {
        String[] animals = {"cat", "dog", "giraffe", "wolf", "lion", "tiger"};
        for (int i = 5; i >= 0; i--) {
            System.out.println(animals[i]);
        }
        int x = 0;
        do {
            if (x % 3 == 0) {
                System.out.println(animals[x]);
            }
            x++;
        }while(x<5);
    }
}
