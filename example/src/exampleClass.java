public class exampleClass {
    public static void main(String[] args) {
        car Honda = new car();
        Honda.model = "Honda 2012";
        Honda.color = "blue";
        Honda.year = 2012;
        Honda.seats = 4;
        Honda.operable= true;
        Honda.display();
        car Ferrari = new car();
        Ferrari.model = "f40";
        Ferrari.color = "red";
        Ferrari.year = 2022;
        Ferrari.seats= 6;
        Ferrari.operable= false;
        Ferrari.display();
    }
}
