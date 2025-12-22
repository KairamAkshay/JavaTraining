import java.util.Scanner;

public class Program17_BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your weight in kg: ");
        double weight = sc.nextDouble();
        System.out.print("Enter your height in meters: ");
        double height = sc.nextDouble();
        if (height <= 0) {
            System.out.println("Invalid height");
        } else {
            double bmi = weight / (height * height);
            System.out.println(bmi);
        }
        sc.close();
    }
}
