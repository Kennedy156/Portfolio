import java.util.Scanner;
public class TestAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int students;
        //years
        int scores;
        //months
        int totalRainfall = 0;
        double averageRainfall;
        System.out.println("Enter number of years");
        students = Integer.parseInt(input.nextLine());
        for(int i = 1; i <= students; i++) {
            for (int j = 1; j <= 12; j++) {
                System.out.printf("Enter inches of rainfall for year %d month %d\n", i, j);
                int rainfall = Integer.parseInt(input.nextLine());
                totalRainfall += rainfall;
            }
        }
        scores = students * 12;
        averageRainfall = (double)totalRainfall / scores;
        System.out.printf("Number of months: %d\n" + "Total inches of rainfall %d\n" + "Average rainfall per month for %d years: %.2f" , months, totalRainfall, years, averageRainfall);
    }
}
}
