import java.util.Scanner;
public class Menu {
    Scanner console = new Scanner(System.in);
    public void printHeader(){
        System.out.println("+----------------+");
        System.out.println("|      Welcome to CS 121     |");
        System.out.println("|       Banking        |");
        System.out.println("|----------------|");
    }
    public void printMenu(){
        while(true){
            String selection;
            System.out.println("\nPlease make a selection: \n"
                                + "1) Access account \n"
                                + "2) Open a new Account \n"
                                +"3) Exit ");
            selection = console.nextLine();
            if(selection.equals("l"))
            {
                this.accessAccount();

            }else if(selection.equals("2")){
                this.createNewAccount();
            }else if(selection.equals("2")){
                System.out.println("Thank you for using CS121 Banking App");
            }
            else{
                System.out.println("Invalid entry");
            }
        }
    }
}
