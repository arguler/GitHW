package Replit;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/*
Create a Map that will preserve an order of entry objects
Add below pair to it .
"Street" = "Patrick ST"
"Suite" = "265"
"City" = "Vienna"
"Zip" = "22180"
"Country" = "United State"
Print all values using iterator
**Expected output:**
Patrick ST
265
Vienna
22180
United State
 */
public class repl_204 {
    public static void main(String[] args) {
        Map<String, String> hashmap = new LinkedHashMap<>();
        hashmap.put("Street", "Patrick ST");
        hashmap.put("Suite", "265");
        hashmap.put("City", "Vienna");
        hashmap.put("Zip", "22180");
        hashmap.put("Country", "United State");
        Iterator<String> iter=hashmap.values().iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
