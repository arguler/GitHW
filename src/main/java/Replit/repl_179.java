package Replit;

/*
Encapsulation
Create Class EncapsulationDemo that will have
2 variables empName and empAge;
Create the getter/setter methods for each variable.
In Main Class and main method
Using setter methods assign the values as "Mario" and "32"
Using getter methods print the values as below outputs.
 **Expected Output:**
Employee Name: Mario
Employee Age: 32
*/
class repl_179 {
    public static void main(String[] args) {
        repl_179_EncapsulatonDemo obj = new repl_179_EncapsulatonDemo();
        obj.setEmpName("Mario");
        System.out.println("Employee Name: " + obj.getEmpName());
        obj.setEmpAge(32);
        System.out.println("Employee Age: " + obj.getEmpAge());

    }
}

class repl_179_EncapsulatonDemo {
    private String empName;
    private int empAge;

    String getEmpName() {
        return empName;
    }

    public void setEmpName(String newempName) {
        this.empName = newempName;
    }

    int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int newempAge) {
        this.empAge = newempAge;
    }
}
