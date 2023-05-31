package Replit;

/*
For you to do:
Create the maxValue method that will accept int array
and return the maximum value in the array.
Method should visible every class in any package!
**Expected Output:**
22
*/
public class repl_141 {
    public static int maxValue(int[] arr) {
        int buyuk = 0;
        int enbuyuk = 0;
        for (int s : arr) {
            if (s > buyuk) {
                buyuk = s;
                enbuyuk = s;
            }
        }
        return enbuyuk;
    }
    public static void main(String[] args) {
        int[] arr = {5, 12, -3, 7, 3, 22};
        System.out.println(maxValue(arr)); //should print 22
    }
}