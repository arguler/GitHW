package Replit;

/*
In main class please declared the variables using different
 access modifiers that will hold value for:
- name, city, name of the school, batch number;
Create a method to display details in following format:
My name is \_\_\_ and I live in \_\__. I study at \_\_\_ in batch \_\_\_
Assign values to the variables and execute method display
**Expected Output:**
My name is John and I live in Miami. I study at Syntax in batch 9
 */
public class repl_137 {
    private static String name="John";
    static String city="Miami";
    protected static String school="Syntax";
    public static int batchnum=9;
    public static class cityshow implements TestDefault2 {

    }
    interface TestDefault2 {
        default void batchshow() {
            System.out.print(batchnum);
        }
    }
    static void nameprint() {
        System.out.print(name);
    }

    static void schoolprint() {
        System.out.print(school);
    }

    static void cityshow() {
        System.out.print(city);
    }

    public static void main(String[] args) {
        repl_137 obj = new repl_137();
        System.out.print("My name is ");
        obj.nameprint();
        System.out.print(" and I live in ");
        obj.cityshow();
        System.out.print(". I study at ");
        obj.schoolprint();
        System.out.print(" in batch ");

        cityshow obj2 = new cityshow();
        obj2.batchshow();
    }
}

