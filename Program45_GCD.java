import java.util.Scanner;

public class Program45_GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x value: ");
        int x = sc.nextInt();
        System.out.print("Enter y value: ");
        int y = sc.nextInt();
        int a = Math.abs(x), b = Math.abs(y);
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        System.out.println(a);
        sc.close();
    }
}
