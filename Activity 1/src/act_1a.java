
import javax.swing.JOptionPane;
import java.util.Scanner;
import javax.swing.*;
public class act_1a {
    public static void main(String[] args) {
        String str, str2;
        int number1, number2;
        str = JOptionPane.showInputDialog("Enter a number");
        number1 = Integer.parseInt(str);
        str2 = JOptionPane.showInputDialog("Enter another number");
        number2 = Integer.parseInt(str2);
        JOptionPane.showMessageDialog(null, number1 + number2);
        JOptionPane.showMessageDialog(null, number1 - number2);
        JOptionPane.showMessageDialog(null, number1 * number2);
        JOptionPane.showMessageDialog(null, (number1 / number2));
        JOptionPane.showMessageDialog(null, Math.sqrt(number1) + " " + Math.sqrt(number2));
        JOptionPane.showMessageDialog(null, Math.pow(number1, number2));
        JOptionPane.showMessageDialog(null, Math.log(number1) + " " + Math.log(number2));

    }

}