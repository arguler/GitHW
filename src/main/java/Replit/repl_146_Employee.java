package Replit;

public class repl_146_Employee {
    String name, lastname, startDate;
    int employeeId, salary;

    void sendno() {
        System.out.println(name+" "+lastname+" "+employeeId+" "
                +startDate+" "+salary);
    }
    void sendall(String name, String lastname,
                   int employeeId, String startDate, int salary){
        this.name=name;
        this.lastname=lastname;
        this.employeeId=employeeId;
        this.startDate=startDate;
        this.salary=salary;
    }
}
