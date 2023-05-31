package Replit;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
# HashMap, Methods, reusability, Logic
Create a Method in Main class using below specification.
Method Name: display.
Return Type: Void
Parameters : Map<String,Integer>
Logic:
First the method will check the given map is empty or not.
If the map is not empty print pairs of key and value using loops
If map is empty simply print "map is empty"
**NOW IN MAIN METHOD**
Create HashMap of String keys and Integer values
add values as below
map.put("mango", 10);
map.put("apple", 30);
map.put("orange", 20);
call above method with these arguments.
then clear the map.
and call above method again.
orange : 20
apple : 30
mango : 10
map is empty
*/
public class repl_208 {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("mango", 10);
        map.put("apple", 30);
        map.put("orange", 20);
        repl_208 obj = new repl_208();
        obj.display(map);
        map.clear();
        obj.display(map);
    }

    void display (Map <String, Integer> map) {
        if (map.size() > 0) {
            Iterator<String> iter = map.keySet().iterator();
            Iterator<Integer> iter1 = map.values().iterator();
            while (iter.hasNext()) {
                System.out.println(iter.next() + " : " + iter1.next());
            }
        }else if(map.size()==0){
            System.out.println("map is empty");
        }
    }
}
