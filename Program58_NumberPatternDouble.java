import java.util.Scanner;

public class Program58_NumberPatternDouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = n - i + 1; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
