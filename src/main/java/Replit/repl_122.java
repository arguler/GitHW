package Replit;

public class repl_122 {
    String country;
    String capital;
    String population;

    repl_122(String c, String ca, String p) {
        country = c;
        capital = ca;
        population = p;
    }

    void yazdir() {
        System.out.println("The capital of "+country+ " is " +capital+" and population is "+population);
    }

    public static void main(String[] args) {
        repl_122 s1 = new repl_122("USA", "Washington DC", "330000000");
        repl_122 s2 = new repl_122("Kazakhstan", "Astana", "18500000");
        s1.yazdir();
        s2.yazdir();
    }
}

