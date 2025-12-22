import java.util.Scanner;

public class Program25_MangalyaDiscounts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter item1 price: ");
        double item1 = sc.nextDouble();
        System.out.print("Enter item2 price: ");
        double item2 = sc.nextDouble();
        System.out.print("Enter item3 price: ");
        double item3 = sc.nextDouble();
        sc.nextLine(); // consume endline
        System.out.print("Enter type of card (platinum/gold/silver): ");
        String card = sc.nextLine().trim().toLowerCase();

        double total = item1 + item2 + item3;
        double discount = 0.0;

        switch (card) {
            case "platinum":
                discount = total * 0.10;
                break;
            case "gold":
                discount = total * 0.08;
                break;
            case "silver":
                discount = total * 0.05;
                break;
            default:
                discount = 0.0;
        }
        System.out.println("total = " + total);
        System.out.println("discount = " + discount);
        sc.close();
    }
}
