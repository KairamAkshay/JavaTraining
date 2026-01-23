import java.util.Scanner;

public class Program42_PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();
        if (n <= 1) {
            System.out.println("it is not a prime number");
            sc.close();
            return;
        }
        boolean isPrime = true;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) { isPrime = false; break; }
        }
        if (isPrime) System.out.println("it is a prime number");
        else System.out.println("it is not a prime number");
        sc.close();
    }
}
