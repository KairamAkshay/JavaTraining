import java.util.Scanner;

public class Program15_ShoppingCartGST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of item1: ");
        double i1 = sc.nextDouble();
        System.out.print("Enter the price of item2: ");
        double i2 = sc.nextDouble();
        System.out.print("Enter the price of item3: ");
        double i3 = sc.nextDouble();

        double subtotal = i1 + i2 + i3;
        double gstRate = 0.10;
        double taxAmount = subtotal * gstRate;
        double finalAmount = subtotal + taxAmount;

        System.out.println("subtotal " + subtotal);
        System.out.println("tax_amount " + taxAmount);
        System.out.println("final_amount " + finalAmount);
        sc.close();
    }
}
