import java.util.Scanner;

public class Program26_NavathaTransportCharges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in km: ");
        int d = sc.nextInt();
        System.out.print("Enter weight in kg: ");
        int w = sc.nextInt();
        int chargePerKg;
        if (d >= 500) {
            if (w >= 100) {
                chargePerKg = 5;
            } else if (w >= 10) {
                chargePerKg = 6;
            } else {
                chargePerKg = 7;
            }
        } else {
            if (w >= 100) {
                chargePerKg = 8;
            } else {
                chargePerKg = 9;
            }
        }
        int charge = w * chargePerKg;
        System.out.println("charge = " + charge);
        sc.close();
    }
}
