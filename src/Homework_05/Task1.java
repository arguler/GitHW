package Homework_05;
/*
Create a method that will take a String as a parameter
and returns reversed String. Method should be available
to all classes within your project and accessible by class name.
 */
public class Task1 {
    static String reversed(String s){
        String a="";
        for (int i = (s.length()-1) ; i >=0 ; i--) {
            a=a+ s.charAt(i);
        }
            return a;
        }
    public static void main(String[] args) {
        System.out.println(reversed("make it"));
        System.out.println(reversed("seni seviyorum"));
    }
}
