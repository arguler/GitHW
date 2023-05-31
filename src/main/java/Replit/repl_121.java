package Replit;

public class repl_121 {
    int number;
    double duble;
    char karakter;

    repl_121(int n, double d, char k) {
        number = n;
        duble = d;
        karakter = k;
    }

    void yazdir() {
        System.out.println(number);
        System.out.println(duble);
        System.out.println(karakter);
    }

    public static void main(String[] args) {
        repl_121 s1 = new repl_121(10, 10.23, 'a');
        repl_121 s2 = new repl_121(100, 100.23, 's');
        s1.yazdir();
        s2.yazdir();
    }
}