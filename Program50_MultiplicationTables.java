import java.util.Scanner;

public class Program50_MultiplicationTables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%d x %d = %d%n", i, j, i * j);
            }
            System.out.println();
        }
        sc.close();
    }
}
