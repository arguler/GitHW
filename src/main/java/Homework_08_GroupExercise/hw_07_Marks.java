package Homework_08_GroupExercise;

/*
We have to calculate the average of marks obtained in three subjects
by student A and by student B. Create class 'Marks' with an abstract
method 'getPercentage' that will be returning the average percentage
of marks. Provide implementation of abstract method in classes 'A'
and 'B'. The constructor of student A takes the marks in three
subjects as its parameters and the marks in four subjects as its
parameters for student B. Test your code
 */
public class hw_07_Marks {
    public static void main(String[] args) {
        A obj = new A() {
            @Override
            void getPercentage(int Math, int Physics, int Chemistry) {
                double percentage = ((double) (Math + Physics + Chemistry) / (3 * 100)) * 100;
                System.out.println("Student A's percentage is " + percentage);
            }
        };
        obj.getPercentage(90, 70, 69);
        B obj1 = new B() {
            @Override
            void getPercentage(int Math, int Physics, int Chemistry, int Language) {
                double percentage = ((double) (Math + Physics + Chemistry + Language)) / (4 * 100) * 100;
                System.out.println("Student B's percentage is " + percentage);
            }
        };
        obj1.getPercentage(89, 97, 78, 94);
    }
}
abstract class A extends hw_07_Marks {
    abstract void getPercentage(int Math, int Physics, int Chemistry);
}
abstract class B extends hw_07_Marks {
    abstract void getPercentage(int Math, int Physics, int Chemistry, int Language);
}