package Replit;

import java.util.HashMap;
import java.util.Map;

/*
Create a Map in which you do not need to preserve the
order of the entries
Add below pair to it .
"Street" = "Patrick ST"
"Suite" = "265"
"City" = "Vienna"
"Zip" = "22180"
"Country" = "United State"
Find how many entries are inside the map
Remove all entires from the Map
Find the Map size again
**Expected Output:**
5
0
*/
public class repl_201 {
    public static void main(String[] args) {
        Map<String, String> hashmap = new HashMap<String, String>();
        hashmap.put("Street", "Patrick ST");
        hashmap.put("Suite", "265");
        hashmap.put("City", "Vienna");
        hashmap.put("Zip", "22180");
        hashmap.put("Country", "United State");
        System.out.println(hashmap.size());
        hashmap.clear();
        System.out.println(hashmap.size());
    }
}

