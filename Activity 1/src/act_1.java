// Mason Kennedy
import javax.swing.JOptionPane;
import java.util.Scanner;
public class act_1 {
    public static void main(String[] args) {
        String firstName, lastName, fullName;
        firstName = JOptionPane.showInputDialog("Enter your first name");
        lastName = JOptionPane.showInputDialog("Enter your last name");
        Scanner name= new Scanner(System.in);
        JOptionPane.showMessageDialog(null,(firstName.toUpperCase() + " " + lastName.toUpperCase()));
        JOptionPane.showMessageDialog(null,(firstName.toLowerCase() + " " + lastName.toLowerCase()));
        JOptionPane.showMessageDialog(null,new StringBuilder(firstName + " " + lastName).reverse().toString());
    }
    }


