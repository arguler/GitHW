package Replit;

import java.util.HashMap;
import java.util.Map;

/*
Create Map in which we want to store keys in Ascending order
Add the below values
1 item = apple
2 item = banana
3 item = pear
4 item = tomato
5 item = mango
6 item: kiwi
Extract all keys and it values and print them in the format below:
**Expected Output:**
Key is 1 item and values is apple
Key is 2 item and values is banana
Key is 3 item and values is pear
Key is 4 item and values is tomato
Key is 5 item and values is mango
Key is 6 item and values is kiwi
*/
public class repl_202 {
    public static void main(String[] args) {
        Map<Integer, String> fruits=new HashMap<>();
        fruits.put(1, "apple");
        fruits.put(2, "banana");
        fruits.put(3, "pear");
        fruits.put(4, "tomato");
        fruits.put(5, "mango");
        fruits.put(6, "kiwi");
        for (Integer i:fruits.keySet()) {
            System.out.println("Key is " + (i) + " item and values is " + fruits.get(i));
        }
    }
}
