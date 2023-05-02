package Replit;

public class repl_118 {

    void spaceOut() {
        String a = "hello";
        String b = "technology";
        for (int i = 0; i < a.length(); i++) {
            System.out.print(a.charAt(i) + " ");
        }
        System.out.println();
        for (int i = 0; i < b.length(); i++) {
            System.out.print(b.charAt(i) + " ");
        }
    }

    public static void main(String[] args) {
        repl_118 d = new repl_118();
        d.spaceOut();
    }
}
