package Replit;
/*
Create Class EncapsulationDemo
create two variable as shown below.
private String empName=John;
private int empAge=30;
Create only getters methods for each variable.
Print the values of each variable as shown below.
**Expected Output:**
Employee Name: John
Employee Age: 30
*/
public class repl_180 {
    public static void main(String[] args) {
        repl_180_EncapsulationDemo obj = new repl_180_EncapsulationDemo();
        System.out.println("Employee Name: " + obj.getEmpName());
        System.out.println("Employee Age: " + obj.getEmpAge());
    }
}
class repl_180_EncapsulationDemo{
    private String empName="John";
    private int empAge=30;

    String getEmpName(){
        return empName;
    }

    int getEmpAge() {
        return empAge;
    }
}


