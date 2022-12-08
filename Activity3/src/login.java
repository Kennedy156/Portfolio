import javax.swing.JOptionPane;
import java.util.Scanner;

public class login {
    public static void main(String[] args){
        /*Login*/
        String userName = "MK";
        String password = "secret";
        String name;
        String pw;
        String message;
        name = JOptionPane.showInputDialog("Enter user name");
        pw = JOptionPane.showInputDialog("Enter password");
        if(userName.equals(name)&& password.equals(pw)){
            message = "Welcome TO CS 121";
        }else if(userName.equals(name) && !password.equals(pw)) {
            message = "Password is incorrect";
        }else if(!userName.equals(name) && password.equals(pw)){
            message = "Username is incorrect";
        }else{
            message = "Username and password are incorrect";
        }
        JOptionPane.showMessageDialog(null,message);
    }
}
