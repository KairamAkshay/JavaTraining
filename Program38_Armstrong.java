import java.util.Scanner;

public class Program38_Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while (temp > 0) {
            int rem = temp % 10;
            sum += rem * rem * rem;
            temp /= 10;
        }
        if (sum == n) {
            System.out.println("given number is armstrong");
        } else {
            System.out.println("given number is not armstrong");
        }
        sc.close();
    }
}
