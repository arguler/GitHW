package Replit;

public class repl_155_A {
    String print(){
        System.out.println("I");
        return null;
    }
}
class repl_155_B extends repl_155_A{

    String print1(){
        super.print();
        System.out.println("am");
        return null;
    }

}
class repl_155_C extends repl_155_B{

    String print2(){
        super.print1();
        System.out.println("a tester");
        return null;
    }
}
