package Homework_08_GroupExercise;
/*
Create an Interface 'Shape' with undefined methods as calculateArea
and calculatePerimiter. Create 2 classes Circle & Square that
implements functionality defined in the Shape Interface. Test your
code.
 */


public interface hw_06 {
    void calculateArea();

    void calculatePerimeter();
}

class Circle implements hw_06 {
    static double pi=3.14149;
    int radius=5;
    double perimetercircle=(2*pi*radius);
    double areacircle=(pi* Math.pow(radius,2));
    @Override
    public void calculateArea() {
        System.out.println("This function calculate area. Area= "+areacircle);
    }
    @Override
    public void calculatePerimeter() {

        System.out.println("This function calculate perimeter. Perimeter= "+perimetercircle);
    }
}
class Square implements hw_06 {
    int edge=5;
    int area=edge*edge;
    int perimeter=4*edge;
    @Override
    public void calculateArea() {
        System.out.println("This function calculate area. Area= "+area);
    }
    @Override
    public void calculatePerimeter() {
        System.out.println("This function calculate perimeter= "+perimeter);
    }
}
class tester{
    public static void main(String[] args) {
        Square obj=new Square();
        obj.calculateArea();
        Square obj1=new Square();
        obj1.calculatePerimeter();
        Circle obj2=new Circle();
        obj2.calculateArea();
        Circle obj3=new Circle();
        obj3.calculatePerimeter();
    }
}