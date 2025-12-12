import java.util.Scanner;

public class Program10_BedOccupancyRate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of beds occupied: ");
        int occupied = sc.nextInt();
        System.out.print("Enter total number of beds: ");
        int total = sc.nextInt();
        if (total <= 0) {
            System.out.println("Total beds must be positive");
        } else {
            double occupancyRate = (occupied * 100.0) / total;
            System.out.printf("Occupancy rate: %.2f%%%n", occupancyRate);
        }
        sc.close();
    }
}
