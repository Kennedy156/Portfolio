import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
public class espGame {
    public static void main(String[] args){
        // 0 = red, 1 = green, 2 = blue, 3 = orange, 4= yellow
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number;
        String color;
        String guess;
        int correct = 0;
        for(int i = 1; i<=10;i++) {
            number = random.nextInt(5);
            if (number == 0) {
                color = "red";

            } else if (number == 1) {
                color = "green";
            } else if (number == 2) {
                color = "blue";
            } else if (number == 3) {
                color = "orange";
            } else {
                color = "yellow";
            }
            System.out.printf("%d. What color has the computer chosen? \n", i);
            guess = scanner.nextLine();
            System.out.printf("The computer chose %s\n", color);
            if (guess.equals(color)) {
                correct++;
            }
        }
        System.out.printf("You got %d out of 10 correct \n", correct);
    }

}
