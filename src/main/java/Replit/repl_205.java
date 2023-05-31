package Replit;

import java.util.LinkedHashMap;
import java.util.Map;

/*
Create a HashMap of String.
Add below pair to it .
"Street" = "Patrick ST"
"Suite" = "265"
"City" = "Vienna"
"Zip" = "22180"
"Country" = "United State"
Print all the values in upper case using entrySet
**Expected Output:**
265
22180
PATRICK ST
UNITED STATE
VIENNA
*/
public class repl_205 {
    public static void main(String[] args) {
        Map<String, String> hashmap = new LinkedHashMap<>();
        hashmap.put("Street", "Patrick ST");
        hashmap.put("Suite", "265");
        hashmap.put("City", "Vienna");
        hashmap.put("Zip", "22180");
        hashmap.put("Country", "United State");
        for(String key: hashmap.values()){
            System.out.println(key.toUpperCase());
        }

    }
}
