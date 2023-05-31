package Replit;

public class repl_127 {
    void non_static(){
        String n1="Programming is amazing.";
        System.out.println(n1);
    }
   static void statik(){
        String n2="Java is awesome.";
        System.out.println(n2);  }
    public static void main(String[] args) {
        repl_127 obj=new repl_127();
        obj.non_static();
        statik();
    }
}

