package Replit;

public class repl_165_Parent {
    public void printfpublic() {
        System.out.println("I am parent public method");
    }

    protected void printfprotected() {
        System.out.println("I am parent protected method");
    }
    private void printfprivate() {
        System.out.println("I am parent private method");
    }
    interface TestInterface {
        default void printfdefault() {
            System.out.println("This is Default Method");
        }
    }
}
