public class Character {
    private String name;
    private int health;
    private int attackPoints;
    private int strength;
    public Character(){

    }
    public Character(String charName){
        this.name = charName;
    }
    public Character(String charName, int charHealth, int charAttackPts, int charStrength){
        this.name= charName;
        this.health= charHealth;
        this.attackPoints = charAttackPts;
        this.strength = charStrength;
    }
    public int getHealth(){
        return health;
    }
    public int getStrength(){
        return strength;
    }
    public void setHealth(int newHealth){
        health= newHealth;
    }
    public void getStrength(int strength){
        this.strength = strength;
    }
    public void setHealth(int newHealth, int strength){
        if(strength>10){
            health = newHealth +5;
        }
    }
}
