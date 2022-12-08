import java.util.Scanner;
public class restaurant {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Is anyone in your party a vegetarian?");
        String veggie = input.nextLine();
        System.out.println("Is anyone in your party a vegan?");
        String vegan = input.nextLine();
        System.out.println("Is anyone in your party gluten free?");
        String gluten = input.nextLine();

        String r = "Here are your restaurant choices: ";
        String joe = "Joe's Gourmet Burgers";
        String main = "Main Street Pizza Company";
        String cafe = "Corner Café";
        String mama = "Mama's Fine Italian";
        String chef = "The Chef's Kitchen";

        if (veggie.equals("yes") && vegan.equals("yes") && gluten.equals("yes")) {
            System.out.printf(r + "\n" + chef + "\n" + cafe);
        }if (veggie.equals("yes") && vegan.equals("yes") && gluten.equals("no")) {
            System.out.printf(r + "\n" + chef + "\n" + cafe);
        } else if (veggie.equals("yes") && vegan.equals("no") && gluten.equals("yes")) {
            System.out.printf(r + "\n" + chef + "\n" + cafe + "\n" + main);
        } else if (veggie.equals("yes") && vegan.equals("no") && gluten.equals("no")) {
            System.out.printf(r + "\n" + chef + "\n" + cafe + "\n" + main + "\n" + mama);
        }else if (veggie.equals("no") && vegan.equals("no") && gluten.equals("no")) {
            System.out.printf(r + "\n" + chef + "\n" + cafe + "\n" + main + "\n" + mama + "\n" + joe);
        } else {
            System.out.println("Not valid");
        }
    }
}
