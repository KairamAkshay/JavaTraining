import java.util.Scanner;

public class Program20_USDtoEUR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double conversionRate = 1.7; // example fixed rate
        System.out.print("Enter the amount in US Dollars: ");
        double usd = sc.nextDouble();
        double eur = usd * conversionRate;
        System.out.println(eur);
        sc.close();
    }
}
