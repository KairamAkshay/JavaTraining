import java.util.Scanner;

public class Program56_StarPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        int k = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                System.out.print("*");
            }
            System.out.println();
            k += 2;
        }
        sc.close();
    }
}
