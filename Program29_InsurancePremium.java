import java.util.Scanner;

public class Program29_InsurancePremium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter person health condition (excellent/poor): ");
        String health = sc.nextLine().trim().toLowerCase();
        System.out.print("Enter person age: ");
        int age = Integer.parseInt(sc.nextLine().trim());
        System.out.print("Enter person living place (city/village): ");
        String place = sc.nextLine().trim().toLowerCase();
        System.out.print("Enter person gender (male/female): ");
        String gender = sc.nextLine().trim().toLowerCase();
        System.out.print("Enter person policy amount: ");
        int policy = Integer.parseInt(sc.nextLine().trim());

        boolean insured = false;
        double ratePerThousand = 0;
        int maxAmount = 0;

        if (health.equals("excellent") && age >= 25 && age <= 35 && place.equals("city") && gender.equals("male") && policy <= 200000) {
            insured = true;
            ratePerThousand = 4;
            maxAmount = 200000;
        } else if (health.equals("excellent") && age >= 25 && age <= 35 && place.equals("city") && gender.equals("female") && policy <= 100000) {
            insured = true;
            ratePerThousand = 3;
            maxAmount = 100000;
        } else if (health.equals("poor") && age >= 25 && age <= 35 && place.equals("village") && gender.equals("male") && policy <= 10000) {
            insured = true;
            ratePerThousand = 6;
            maxAmount = 10000;
        }

        if (insured) {
            double amount = (policy / 1000.0) * ratePerThousand;
            System.out.println("Insured");
            System.out.println("Premium amount = " + amount);
            System.out.println("Maximum allowable policy amount = " + maxAmount);
        } else {
            System.out.println("Not insured");
        }
        sc.close();
    }
}
