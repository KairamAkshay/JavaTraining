import java.util.Scanner;

public class Program46_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n (number of terms): ");
        int n = sc.nextInt();
        long n1 = 0, n2 = 1;
        if (n <= 0) {
            // nothing
        } else if (n == 1) {
            System.out.println(n1);
        } else {
            System.out.println(n1);
            System.out.println(n2);
            for (int i = 2; i < n; i++) {
                long n3 = n1 + n2;
                System.out.println(n3);
                n1 = n2;
                n2 = n3;
            }
        }
        sc.close();
    }
}
