package Replit;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
Create HashMap
add values as below
map.put("mango", 10);
map.put("apple", 30);
map.put("orange", 20);
map.put("mango", 40);
map.put("mango", 40);
Using iterator retrieve all keys and values if the format below:
**Expected Output:**
Key = orange and value = 20
Key = apple and value = 30
Key = mango and value = 40
*/
public class repl_203 {
    public static void main(String[] args) {
        Map<String, Integer> fruits = new HashMap<String, Integer>();
        fruits.put("mango", 10);
        fruits.put("apple", 30);
        fruits.put("orange", 20);
        fruits.put("mango", 40);
        fruits.put("mango", 40);
        Iterator<String> iter = fruits.keySet().iterator();
        Iterator<Integer> iter1=fruits.values().iterator();
        while (iter.hasNext()) {
            System.out.println("Key = " + iter.next() + " and value = " + iter1.next());
        }
    }
}
