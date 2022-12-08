import java.util.Scanner;
public class fort {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int floors;
        int totalRooms = 0;
        int totalOccupiedRooms =0;
        int totalVacantRooms;
        double occupancyRate;
        System.out.println("Enter number of floors:");
        floors = Integer.parseInt(input.nextLine());
        for(int i =1; i<=floors; i++){
            System.out.printf("Enter number of rooms on floor %d \n", i);
            int rooms = Integer.parseInt(input.nextLine());
            System.out.println("How many of the floor's rooms are occupied");
            int occupiedRooms = Integer.parseInt(input.nextLine());
            totalRooms += rooms;
            totalOccupiedRooms += occupiedRooms;
        }
    totalVacantRooms = totalRooms - totalOccupiedRooms;
    occupancyRate = (double)totalOccupiedRooms / totalRooms;
    System.out.printf("Floors: %d\nRooms: %d\nOccupied Rooms: %d \nVacant Rooms: %d\n" + "Occupancy: %.2f(%d%%",floors, totalRooms, totalOccupiedRooms, totalVacantRooms, occupancyRate,(int)(occupancyRate * 100));

    }
}
