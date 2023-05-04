package Replit;

public class repl_128 {
    static String firstValue = "", secondValue = "";

    //test case below (dont change):
    public static void main(String[] args) {
        String firstValue = mixString("12345", "abcde");
        System.out.println(firstValue);
        String secondValue = mixString("howdy", "hello");
        System.out.println(secondValue);
    }
    public static String mixString(String s1, String s2) {
        String s = "";
        for (int i = 0; i < s1.length(); i++) {
            s += s1.substring(i, i + 1) + s2.substring(i, i + 1);
        }
        return s;
    }
}