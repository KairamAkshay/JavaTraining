import java.util.Scanner;

public class Program09_RoverDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter speed_of_rover (m/s): ");
        double speed = sc.nextDouble();
        System.out.print("Enter time_in_seconds: ");
        int time = sc.nextInt();
        double distance = speed * time;
        System.out.println("Distance travelled (meters): " + distance);
        sc.close();
    }
}
