package Replit;

import java.util.ArrayList;
import java.util.Iterator;

/*
Create a Set collection in which you want to preserve an order of inserted String Objects.
Add the below values
- null
- Sohil
- Diego
- Alijon
- Asel
- Sumair
Print values 1 by 1 using loop and Iterator
null
Sohil
Diego
Alijon
Asel
Sumair
null
Sohil
Diego
Alijon
Asel
Sumair
*/
public class repl_199 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<String>();
        names.add(null);
        names.add("Sahil");
        names.add("Diego");
        names.add("Alijon");
        names.add("Asel");
        names.add("Sumair");
        for (String i:names){
            System.out.println(i);
        }
        Iterator<String> iter = names.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
