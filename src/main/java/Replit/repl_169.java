package Replit;

/*
**For you to do:**
Create final method avgElements that will average all
the elements in an integer array (passed to the method
as a parameter) and return the average.
**Expected Output:**
4.8
 */
public class repl_169 {

    public static void main(String[] args) {
        int[] a = {2, 7, 3, 8, 4};
        System.out.println(avgElements(a)); //should print 4.8
    }
    static final double avgElements(int[] a) {
        double sum = 0;
        double avg=0;
        for (int i = 0; i <a.length; i++) {
            sum = a[i] + sum;
        }
        avg = (sum/a.length);
        return avg;
    }
}
