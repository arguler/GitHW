package Replit;
import java.util.Scanner;
public class repl_113 {
    int hour=11, minute=30;
    void input(){
        String time=(hour+":"+minute);
        System.out.println(time);
    }
    void concat(){
        input();
    }

    public static void main(String[] args) {
        repl_113 c=new repl_113();
        c.concat();
    }
}
