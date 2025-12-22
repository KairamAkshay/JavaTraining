import java.util.Scanner;

public class Program14_DiscountPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the original price: ");
        double original = sc.nextDouble();
        int discountPercentage = 20;
        double discountAmount = original * (discountPercentage / 100.0);
        double finalPrice = original - discountAmount;
        System.out.println("original_price " + original);
        System.out.println("discount_percentage " + discountPercentage);
        System.out.println("final_price " + finalPrice);
        sc.close();
    }
}
