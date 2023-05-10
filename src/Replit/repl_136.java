package Replit;

public class repl_136 {
    private void print() {
        System.out.println("This is Private Method");
    }
    protected void display()
    {
        System.out.println("This is Protected Method");
    }
    public void son(){
        System.out.println("This is Public Method");
    }
    interface TestInterface {
        default void show() {
            System.out.println("This is Default Method");
        }
    }
    public static void main(String[] args) {

        repl_136 obj = new repl_136();
        obj.print();
        TestDefault obj2 = new TestDefault();
        obj2.show();
        repl_136 obj3=new repl_136();
        obj3.display();
        repl_136 obj4=new repl_136();
        obj4.son();
    }
    public static class TestDefault implements TestInterface {

    }
}