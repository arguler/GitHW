package Replit;

public class repl_119 {
    void censorLettor () {
        String a="computer science";
        String b="trick or treat";
        String new_a = a.replace("e", "*");
        String new_b = b.replace("t", "*");
        System.out.println(new_a);
        System.out.println(new_b);
    }
    public static void main (String [] args){
        repl_119 d=new repl_119();
        d.censorLettor();
    }
}


