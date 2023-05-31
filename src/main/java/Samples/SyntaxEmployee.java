package Samples;

/*Create a Class called Samples.SyntaxEmployee:
Create three  variables  empID , salary and set the CEO to “Sumair”
Create two objects of the class Samples.SyntaxEmployee
Set the value of eID, salary for each of the objects
Print out the eID , salary and  CEO for each of the objects*/
public class SyntaxEmployee {
    /*String eID;
    double salary;
    static String CEO="Sumair";
    Samples.SyntaxEmployee(String e, double s){
        eID=e;
        salary=s;
    }
    public static void main(String[] args){
        Samples.SyntaxEmployee mehmet=new Samples.SyntaxEmployee("325678", 10000d);
        Samples.SyntaxEmployee aliriza=new Samples.SyntaxEmployee("234213", 15000d);
        System.out.println(mehmet);

    }*/
        String empId;
        double salary;
        static String CEO="Sumair";

        public static void main(String[] args) {
            SyntaxEmployee asghar=new SyntaxEmployee();
            asghar.empId="123456";
            asghar.salary=900000;
            System.out.println(asghar.CEO); // not the preferred way
            System.out.println(SyntaxEmployee.CEO);// 99.99 this is how they are used

            SyntaxEmployee sohail=new SyntaxEmployee();
            sohail.empId="584685";
            sohail.salary=92000;
            System.out.println(sohail.empId);
            System.out.println(asghar.empId);
        }
}