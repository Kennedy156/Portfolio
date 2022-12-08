import java.util.Scanner;
import java.util.Random;
public class PokemonBattle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int number;

        System.out.println("POKEMON BATTLE \nEnter odd number of rounds: ");
        int rounds = Integer.parseInt(input.nextLine());
        int wins = 0;
        int wins1 = 0;


        //gameplay
        for (int i = 1; i <= rounds; i++) {

            //player 1
            System.out.println("\nPlayer 1: Select a Pokemon and enter its stats");
            System.out.println("Enter name: ");
            String pokemon1 = input.nextLine();
            System.out.println("Enter HP: ");
            int hp1 = Integer.parseInt(input.nextLine());
            System.out.println("Enter move: ");
            String move1 = input.nextLine();
            System.out.println("Enter move's power: ");
            int movePower1 = Integer.parseInt(input.nextLine());
            System.out.println("Enter attack speed: ");
            int speed1 = Integer.parseInt(input.nextLine());

            //player 2

            //DO NOT TOUCH ABOVE THIS
            System.out.printf("Round %d \n_______\n", i);
            System.out.println("\nPlayer 2: Select a Pokemon and enter its stats");
            System.out.println("Enter name: ");
            String pokemon = input.nextLine();
            System.out.println("Enter HP: ");
            int hp = Integer.parseInt(input.nextLine());
            System.out.println("Enter move: ");
            String move = input.nextLine();
            System.out.println("Enter move's power: ");
            int movePower = Integer.parseInt(input.nextLine());
            System.out.println("Enter attack speed: ");
            int speed = Integer.parseInt(input.nextLine());
            //win condition p1
            if (speed > speed1) {
                hp1 = movePower- hp1;
                if (hp1 < 0) {
                    wins++;
                    System.out.printf("Player 1's %s wins this round!\n", pokemon);
                    System.out.printf("Wins \n____\nPlayer 1: %d \nPlayer 2: %d\n", wins, wins1);
                } else if (hp1 > 0) {
                    hp = movePower1 - hp;
                    if (hp < 0) {
                        wins1++;
                        System.out.printf("Player 2's %s wins this round!\n", pokemon1);
                        System.out.printf("Wins \n____\nPlayer 1: %d \nPlayer 2: %d\n", wins, wins1);
                    }
                }
                //Win condition p2
            } else if (speed1 > speed) {
                hp = movePower1 - hp;
                if (hp < 0) {
                    wins1++;
                    System.out.printf("Player 2's %s wins this round!\n", pokemon1);
                    System.out.printf("Wins \n____\nPlayer 1: %d\nPlayer 2: %d\n", wins, wins1);
                } else if (hp > 0) {
                    hp = movePower1 - hp;
                    if (hp < 0) {
                        wins++;
                        System.out.printf("Player 1's %s wins this round!\n", pokemon);
                        System.out.printf("Wins \n____\nPlayer 1: %d\nPlayer 2: %d\n", wins, wins1);
                    }
                }
                //RANDOM
            } else {
                number = random.nextInt(5);
                //winning condition for p1
                if (number == 0 || number == 1 || number == 2) {
                    hp1 = movePower - hp1;
                    if (hp1 < 0) {
                        wins++;
                        System.out.printf("Player 1's %s wins this round!\n", pokemon);
                        System.out.printf("Wins \n____ \nPlayer 1: %d\nPlayer 2: %d\n", wins, wins1);
                    } else {
                        hp = movePower1 - hp;
                        if (hp < 0) {
                            wins1++;
                            System.out.printf("Player 2's %s wins this round!\n", pokemon1);
                            System.out.printf("Wins \n____ \nPlayer 1: %d\nPlayer 2: %d\n", wins, wins1);
                        }
                    }
                } else {
                    //winning condition p2
                    hp = movePower1- hp;
                    if (hp < 0) {
                        wins1++;
                        System.out.printf("Player 2's %s wins this round!\n", pokemon1);
                        System.out.printf("Wins \n____\nPlayer 1: %d\nPlayer 2: %d\n", wins, wins1);
                    } else {
                        hp1 = movePower- hp1;
                        if (hp1 < 0) {
                            wins++;
                            System.out.printf("Player 1's %s wins this round!\n", pokemon);
                            System.out.printf("Wins \n____\nPlayer 1: %d\nPlayer 2: %d\n", wins, wins1);
                        }
                    }
                }
            }
        }if(wins > wins1){
            System.out.printf("Final Scores \n_______\nPlayer 1: %d\nPlayer 2:%d", wins, wins1);
            System.out.println("Player 1 wins the game!");
        }else{
            System.out.printf("Final Scores \n_______\nPlayer 1: %d\nPlayer 2:%d", wins, wins1);
            System.out.println("Player 2 wins the game!");
        }
    }
}
