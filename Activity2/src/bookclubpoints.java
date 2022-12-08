import javax.swing.JOptionPane;
import java.util.Scanner;
public class bookclubpoints {
        public static void main(String[] args){
            Scanner name = new Scanner(System.in);
            System.out.println("Enter number of books you have purchased.");
            int number;
            number = Integer.parseInt(name.nextLine());
            if (number == 0){
                JOptionPane.showMessageDialog(null, "0 points.");
            }else if (number ==1){
                JOptionPane.showMessageDialog(null, "5 points.");
            }else if (number ==2) {
                JOptionPane.showMessageDialog(null, "15 points.");
            }else if (number ==3) {
                JOptionPane.showMessageDialog(null, "30 points.");
            }else {
                JOptionPane.showMessageDialog(null, "60 points.");
            }
        }
    }

