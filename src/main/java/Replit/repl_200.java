package Replit;

import java.util.*;

/*
Create A Map that will preserve an order of entry objects
Add below pairs :
"Street" = "Patrick ST"
"Suite" = "265"
"City" = "Vienna"
"Zip" = "22180"
"Country" = "United State"
Print all values of from the map
**Expected Output:**
Patrick ST
265
Vienna
22180
United State
*/
public class repl_200 {
    public static void main(String[] args) {
        Map<String, String> hashmap = new LinkedHashMap<>();
        hashmap.put("Street", "Patrick ST");
        hashmap.put("Suite", "265");
        hashmap.put("City", "Vienna");
        hashmap.put("Zip", "22180");
        hashmap.put("Country", "United State");
        for(String i:hashmap.values()){
            System.out.println(i);
        }
    }
}
