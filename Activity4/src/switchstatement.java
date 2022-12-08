import java.util.Scanner;
public class switchstatement {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println("What is your Hogwarts house?");
        String houseNumber = (console.nextLine());
        String houseName;
        String animal = "none";
        String color = "none";
        String values = "none";
        switch(houseNumber){
            case "Ravenclaw":

                animal= "Eagle";
                color = "Blue";
                values = "intelligence, learning, wisdom and wit.";
                break;
            case "Hufflepuff":

                animal = "Badger";
                color = "Yellow";
                values = "A strong sense of justice, loyalty, patience, and a propensity for hard work.";
                break;
            case "Slytherin":

                animal = "Snake";
                color= "Green";
                values = "Ambition, cunning, leadership, and resourcefulness.";
                break;
            case "Gryffindor":

                animal = "Lion";
                color = "Red";
                values = "Courage, bravery, nerve, and chivalry.";
                break;
            default:
                houseName = "Not a house";
                break;
        }
        System.out.println(houseNumber + " "+ animal + " " + color + " " + values);

        console.close();
    }
}
