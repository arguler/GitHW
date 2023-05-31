package Homework_08_GroupExercise;

public class hw_10_Tester {
    public static void main(String[] args) {
        hw_10_ChromeDriver obj = new hw_10_ChromeDriver();
        obj.navigate();
        hw_10_ChromeDriver obj1 = new hw_10_ChromeDriver();
        obj1.open();
        hw_10_ChromeDriver obj2 = new hw_10_ChromeDriver();
        obj2.close();
        hw_10_ChromeDriver obj3 = new hw_10_ChromeDriver();
        obj3.getTitle();
    }
}

