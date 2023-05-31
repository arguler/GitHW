package Replit;

import java.util.HashSet;

/*
Create the HashSet with list of Integers add the below numbers for the list
111
111
111
999
999
999
Print elements one by one.
**Expected Output**
999
111
*/
public class repl_195 {
    public static void main(String[] args){
    HashSet<Integer> input=new HashSet<Integer>();
        input.add(111);
        input.add(111);
        input.add(111);
        input.add(999);
        input.add(999);
        input.add(999);
        for(Integer i:input){
            System.out.println(i);
        }
    }
}
