public class car {
    public String model;
    public String color;
    public int seats;
    public int miles;
    public int year;
    public boolean operable;
    public car(){
        model = "TestModel";
        color = "TestColor";
        seats = 4;
        miles = 0;
        year = 2000;
        operable = true;

    }
    public car(String mode, String color, int seats, int miles, int years, boolean operable){

    }
    public void display(){
        System.out.println("Model is: "+ model);
        System.out.println("Color is: "+color);
        System.out.println("Number of seats: "+ seats);
        System.out.println("Number miles: "+ miles);
        System.out.println("Year: "+year);
        System.out.println("Operable: "+operable);
    }
}
