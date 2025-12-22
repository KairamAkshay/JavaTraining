import java.util.Scanner;

public class Program16_FitnessTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String name = sc.nextLine();
        System.out.print("Enter your weight in kg: ");
        double weight = Double.parseDouble(sc.nextLine().trim());
        System.out.print("Enter how long did you run for (minutes): ");
        double runDuration = Double.parseDouble(sc.nextLine().trim());

        double caloriesPerMinute = 9.0;
        double totalCalories = runDuration * caloriesPerMinute;
        double caloriesPerKgForWeightLoss = 7700.0;
        double estimatedWeightLoss = totalCalories / caloriesPerKgForWeightLoss;

        System.out.println(name);
        System.out.println("entered weight = " + weight);
        System.out.println("running duration = " + runDuration);
        System.out.println("calories burned per minute = " + caloriesPerMinute);
        System.out.println("total calories burned = " + totalCalories);
        System.out.println("estimated weightloss = " + estimatedWeightLoss);
        sc.close();
    }
}
