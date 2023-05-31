package Replit;

import java.util.HashMap;
import java.util.Map;

/*
# Hash Map
Create a Hash Map of String pairs
add the follow values
map.put("ONE","AAA");
map.put("TWO","BBB");
map.put("THREE","CCC");
map.put("FOUR","DDD");
map.put("FIVE","EEE");
Using entry set print key and values pairs using loop
Remove below from Map
"ONE"
"FOUR"
Using entry set print key and values pairs using loop
**Expected Output:**
HashMap Before Remove :
FIVE : EEE
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : CCC
------------------
HashMap After Remove :
FIVE : EEE
TWO : BBB
THREE : CCC
 */
public class repl_206 {
    public static void main(String[] args) {
        Map<String, String> map=new HashMap<String, String>();
        map.put("ONE","AAA");
        map.put("TWO","BBB");
        map.put("THREE","CCC");
        map.put("FOUR","DDD");
        map.put("FIVE","EEE");
        System.out.println("HashMap Before Remove :");
        for (String i:map.keySet()){
            System.out.println(i+" : "+map.get(i));
        }
        map.remove("ONE");
        map.remove("FOUR");
        System.out.println("------------------");
        System.out.println("HashMap After Remove :");
        for (String i:map.keySet()){
            System.out.println(i+" : "+map.get(i));
        }
    }
}
