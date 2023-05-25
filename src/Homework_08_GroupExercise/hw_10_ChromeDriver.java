package Homework_08_GroupExercise;

public class hw_10_ChromeDriver implements hw_10_RemoteWebDriver {

    @Override
    public void navigate() {
        System.out.println("Method navigate is working");
    }

    @Override
    public void open() {
        System.out.println("Method open is working");
    }

    @Override
    public void close() {
        System.out.println("Method close is working");
    }

    @Override
    public String getTitle() {
        System.out.println("Method getTitle is working");
        return null;
    }
}
