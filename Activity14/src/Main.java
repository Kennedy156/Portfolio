public class Main {
    public static void main(String[] args) {
        Character character1 = new Character();
        Character character2 = new Character("Woomy");
        Character character3 = new Character("Mason" , 5, 25, 15);
        System.out.printf("Original health: %d\n", character3.getHealth());
        character3.setHealth(7);
        System.out.printf("Set Health: %d\n", character3.getHealth());
        character3.setHealth(8, character3.getStrength());
        System.out.printf("Set health with strength: %d\n", character3.getHealth());
    }
}
