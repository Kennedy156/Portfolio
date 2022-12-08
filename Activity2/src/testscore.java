import javax.swing.JOptionPane;
import java.util.Scanner;
public class testscore {
    public static void main(String[] args){
        double num1, num2, num3;
        Scanner name = new Scanner(System.in);
        System.out.println("Enter first number");
        num1 = name.nextDouble();
        System.out.println("Enter second number");
        num2 = name.nextDouble();
        System.out.println("Enter third number");
        num3 = name.nextDouble();
        JOptionPane.showMessageDialog(null, "Average : " + (num1+num2+num3)/3);
        if ((num1+num2+num3)/3 < 60){
            JOptionPane.showMessageDialog(null, "F");
        }else if ((num1+num2+num3)/3 < 70) {
            JOptionPane.showMessageDialog(null, "D");
        }else if ((num1+num2+num3)/3 < 80) {
            JOptionPane.showMessageDialog(null, "C");
        }else if ((num1+num2+num3)/3 < 90) {
            JOptionPane.showMessageDialog(null, "B");
        }else {
            JOptionPane.showMessageDialog(null, "A");
        }
        name.close();
    }
}
