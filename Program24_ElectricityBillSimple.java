import java.util.Scanner;

public class Program24_ElectricityBillSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter present month units: ");
        int punits = sc.nextInt();
        System.out.print("Enter previous month units: ");
        int lunits = sc.nextInt();
        if (punits < lunits) {
            System.out.println("Present units must be >= previous units");
            sc.close();
            return;
        }
        int noUnits = punits - lunits;
        System.out.println("consumed units = " + noUnits);

        double cost;
        if (noUnits <= 50) {
            cost = 0.0;
        } else if (noUnits <= 100) {
            cost = noUnits * 1.50;
        } else if (noUnits <= 150) {
            cost = noUnits * 2.50;
        } else if (noUnits <= 200) {
            cost = noUnits * 3.50;
        } else if (noUnits <= 250) {
            cost = noUnits * 4.50;
        } else if (noUnits <= 300) {
            cost = noUnits * 5.50;
        } else {
            cost = noUnits * 6.0;
        }
        System.out.println("cost = " + cost);
        sc.close();
    }
}
