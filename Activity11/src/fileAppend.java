import javax.swing.JOptionPane;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class fileAppend {
    public static void main(String[] args) throws IOException{
        try{
            FileWriter fileWriter = new FileWriter("mycourses.txt", true);
            PrintWriter output = new PrintWriter(fileWriter);
            String course = JOptionPane.showInputDialog("Enter course name");
            String credits = JOptionPane.showInputDialog("Enter course credits");
            String score = JOptionPane.showInputDialog("Enter course score");
            output.printf("%s %s %s", course, credits, score);
            fileWriter.close();
        }catch(FileNotFoundException e){
            System.err.println("Error occured");
        }
    }
}
