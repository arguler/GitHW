package Homework_04;

import org.w3c.dom.ls.LSOutput;

public class Students {
    String Name, ID;
    static int numberOfStudents;
    Students (String N, String I, int n){
        Name=N;
        ID=I;
        numberOfStudents=n;
    }

    public static void main(String[] args) {
        Students s1=new Students("Ali Rıza", "AG2021", (numberOfStudents+1));
        Students s2=new Students("Sami", "SG3619", (numberOfStudents+1));
        Students s3=new Students("Melike", "MG1130", (numberOfStudents+1));
        System.out.println("Total number of students: "+ numberOfStudents);
    }
}
