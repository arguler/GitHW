package Replit;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
Create Hash Map.
add the follow values
map.put("ONE","AAA");
map.put("TWO","BBB");
map.put("THREE","CCC");
map.put("FOUR","DDD");
map.put("FIVE","EEE");
Using EntrySet print the key and values pairs using iterator only
replace with below key THREE--> ASEL and key FIVE-->SUMAIR
Using EntrySet print the key and values pairs using iterator only
OUTPUT
HashMap Before Replace :
FIVE : EEE
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : CCC
------------------
HashMap After Replace :
FIVE : SUMAIR
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : ASEL
*/
public class repl_207 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("ONE", "AAA");
        map.put("TWO", "BBB");
        map.put("THREE", "CCC");
        map.put("FOUR", "DDD");
        map.put("FIVE", "EEE");
        System.out.println("HashMap Before Replace :");
        Iterator<String> iter = map.keySet().iterator();
        Iterator<String> iter1 = map.values().iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next() + " : " + iter1.next());
        }

        map.replace("THREE", "ASEL");
        map.replace("FIVE", "SUMAIR");

        System.out.println("------------------");
        System.out.println("HashMap After Replace :");
        Iterator<String> iter2 = map.keySet().iterator();
        Iterator<String> iter3 = map.values().iterator();
        while (iter2.hasNext()) {
            System.out.println(iter2.next() + " : " + iter3.next());

        }
    }
}