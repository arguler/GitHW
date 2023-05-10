package Homework_06;
/*
Write a java class that have 4 constructors with 4 different access levels
of constructors(private,public,default,protected) and create 4 objects of
this class: 1 - inside same class; 2 - from outside the class;
3 - from different class inside different package  and observe result.
 */
public class constructor {
    String name, done, lesson, kid, name2;
    int grd1;
    private constructor(String name, String done){
        this.name=name;
        this.done=done;
        System.out.println(this.name+" "+this.done);
    }
    public void constructor1(String lesson, int grd1){
        this.lesson=lesson;
        this.grd1=grd1;
        System.out.println(this.lesson+" "+this.grd1);
    }
    protected void constructor1(String kid, String name2){
        this.kid=kid;
        this.name2=name2;
    }
    public static void main(String[] args) {
        constructor obj1=new constructor("Ali Rıza", "run");
    }
}
