package Replit;

public class repl_120 {
    public int year, batch;
    String school_name;

    repl_120(int y, String s, int b) {
        year = y;
        school_name = s;
        batch = b;
    }

    void print() {
        System.out.println("I am a student of batch " + batch + " studying at " + school_name + " in the year of " + year);
    }

    public static void main(String[] args) {
        repl_120 r1 = new repl_120(2021, "Syntax", 9);
        r1.print();
    }
}
