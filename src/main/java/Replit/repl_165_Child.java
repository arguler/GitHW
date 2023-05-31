package Replit;

public class repl_165_Child extends repl_165_Parent {

    @Override
    public void printfpublic() {
        System.out.println("I am child public method");
    }

    @Override
    protected void printfprotected() {
        System.out.println("I am child protected method");
    }
    /*@Override
    private void printfprivate() {
        System.out.println("I am child private method");
    }*/
    public static interface TestInterface {
        static void printdefault() {
            System.out.println("I am child default method");
        }
    }
}
