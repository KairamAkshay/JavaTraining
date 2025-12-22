import java.util.Scanner;

public class Program27_TrueJetDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your amount: ");
        double amount = sc.nextDouble();
        System.out.print("Enter number of tickets: ");
        int tickets = sc.nextInt();
        double discount = (tickets >= 5) ? amount * 0.12 : 0.0;
        double totalAmount = amount - discount;
        System.out.println("total amount = " + totalAmount);
        sc.close();
    }
}
