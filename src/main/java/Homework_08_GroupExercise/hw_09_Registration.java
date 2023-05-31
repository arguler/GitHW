package Homework_08_GroupExercise;

/*
Create Registration Class in which you would have variables as
email, userName and password that have an access scope only
within its own class. After creating an object of the class user should
be able to call methods and in each method separately pass values
to set users email, username and password.
Requirements:
A. Valid email consider to be only yahoo
B. Valid userName and password cannot be empty and should be of
length larger than 6 characters. Also valid password cannot contain
userName.
 */
public class hw_09_Registration {
    private String email, userName, password;

    public void registeremail(String email) {
        this.email = email;
        boolean valid = true;
        if (email.contains("@yahoo.com")) {
            System.out.println(valid);
        } else {
            System.out.println("This email does not valid");
        }
    }

    public void registeruserName(String userName) {
        this.userName = userName;
        char[] ch = userName.toCharArray();
        if (ch.length > 6 && !userName.equals("")) {
            System.out.println("This username is valid");
        } else {
            System.out.println("This username is not valid. It must larger than 6 " +
                    "characters and must not empty");
        }
    }

    public void registerpassword(String password) {
        this.password = password;
        char[] pw = password.toCharArray();
        if (password.equals(userName)) {
            System.out.println("Your password is equals to your username. "
                    + "Please change it ");
        } else if (pw.length < 6 && password.equals("")) {
            System.out.println("This password is not valid. It must larger than 6 " +
                    "characters and must not empty");
        } else {
            System.out.println("This password is valid");
        }
    }

    public static void main(String[] args) {
        hw_09_Registration obj = new hw_09_Registration();
        obj.registeremail("arguler@yahoo.com");
        hw_09_Registration obj1 = new hw_09_Registration();
        obj1.registeruserName("arguler");
        hw_09_Registration obj2 = new hw_09_Registration();
        obj1.registerpassword("");

    }
}


