import java.util.Scanner;

public class Program18_MoonGravity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Inputs expected: mass of moon (kg), radius of moon (meters)
        System.out.print("Enter mass of moon (kg): ");
        double M = sc.nextDouble();
        System.out.print("Enter radius of moon (m): ");
        double R = sc.nextDouble();
        if (R <= 0) {
            System.out.println("Radius must be positive");
            sc.close();
            return;
        }
        double G = 6.67430e-11; // m^3 kg^-1 s^-2
        double g = G * M / (R * R);
        System.out.println("Surface gravitational acceleration (m/s^2) = " + g);
        sc.close();
    }
}
