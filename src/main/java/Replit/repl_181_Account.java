package Replit;

/*
Create the below variables:
- acc_no;
- name;
- email;
- double amount;
Create the getter/setter methods for each variable.
*/
public class repl_181_Account {
    private String acc_no;
    private String name;
    private String email;
    private double amount;

    String getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(String newacc_no) {
        this.acc_no = newacc_no;
    }

    String getName() {
        return name;
    }

    public void setName(String newname) {
        this.name = newname;
    }
    String getEmail() {
        return email;
    }

    public void setEmail(String newemail) {
        this.email = newemail;
    }
    double getAmount() {
        return amount;
    }

    public void setAmount(double newamount) {
        this.amount = newamount;
    }
}
