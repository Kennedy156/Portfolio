import java.util.Scanner;

public class guessing {
    public static void main (String[] args){
        Scanner xscanner = new Scanner(System.in);
        int numberOfGuesses = 0;
        int number = 33;
        String input;
        int guess;
        System.out.println("Guess a number between 1 and 100, "+ " or enter \"q\" if you give up:");
        while(true){
            numberOfGuesses += 1;
            input = xscanner.nextLine();
            if(input.equals("q")){
                System.out.printf("Quitter! The number was %d." , number);
                break;

            }else{
                guess = Integer.parseInt(input);
                if(guess > number){
                    System.out.println("Too high. Guess again!");
                }else if(guess < number){
                    System.out.println("Too low. Guess again!");
                }else{
                    System.out.printf("Correct! \nNumber of guess: %d",numberOfGuesses);
                    break;
                }
            }
        }
    }
}
