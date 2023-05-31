package Homework_04;
/*Create a method that will say Hello in different language
based on the country that will passed when method is executed.
 */
import java.util.Scanner;
public class HWMethods_01 {
    public static void main(String[] args) {
        HWMethods_01 obj = new HWMethods_01();
        obj.whereami();
    }
    public void whereami() {
        Scanner imp = new Scanner(System.in);
        System.out.println("Where are you from?");
        String word = imp.next();
        if (word.equals("Türkiye")) {
            System.out.println("Merhaba");
        } else if (word.equals("Italia")) {
            System.out.println("Ciao");
        } else if (word.equals("France")) {
            System.out.println("Bonjour");
        } else if (word.equals("USA")) {
            System.out.println("Hello");
        }
        else {
            System.out.println("I didn't understand the country");
        }
    }
}


