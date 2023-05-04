package Replit;
/*
**For you to do:**
Create a variable that will hold the count of all instances of the Main class;
Create 3 Object of the class and print value of the count variable;
 */
public class repl_126{
    static int objectCount = 0;

    {
        objectCount += 1;
    }
    public static void main(String[] args) {
        repl_126 t1 = new repl_126();
        repl_126 t2 = new repl_126();
        repl_126 t3 = new repl_126();
        repl_126 t4 = new repl_126();
        System.out.println("Object Count "+objectCount);
    }
}