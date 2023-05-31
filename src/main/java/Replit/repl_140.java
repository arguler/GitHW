package Replit;
/*
For you to do:
Create the maxLength method that will accept String array of words
and return the word with the largest length.
Method should visible only within same package!
**Expected Output:**
this is long
 */
public class repl_140 {

    interface uzunluk {
        default String maxLength(String[] arr) {
            int maxuzunluk = 0;
            String longestString = "";
            for (String s : arr) {
                if (s.length() > maxuzunluk) {
                    maxuzunluk = s.length();
                    longestString = s;
                }
            }
            return longestString;
        }
    }

    public static void main(String[] args) {
        String[] arr = {"hey", "yolo", "hi", "this is long"};
        maksimum obj = new maksimum();
        System.out.println(obj.maxLength(arr));
        //should print "this is long"
        class maksimum implements uzunluk {
        }
    }
}


class maksimum implements repl_140.uzunluk {
}