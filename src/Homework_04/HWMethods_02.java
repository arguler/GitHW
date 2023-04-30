package Homework_04;
/*Create a method createEmail(). Based on values of users
 firstName,lastName and email type, your method should return
  complete email Address. Example:  createEmail(John, Snow,
   gmail) → johnsnow@gmail.com
 */
import java.util.Scanner;
public class HWMethods_02 {
    public void createEmail(){
        Scanner imp = new Scanner(System.in);
        System.out.println("Please write your first name :");
        String firstname = imp.next();
        System.out.println("Please write your first name :");
        String lastname = imp.next();
        System.out.println("Which mail do you want (gmail, hotmail etc..:");
        String mail = imp.next();
        System.out.println(firstname+lastname+"@"+mail+".com");
    }

    public static void main(String[] args) {
        HWMethods_02 obj=new HWMethods_02();
        obj.createEmail();
    }

}
