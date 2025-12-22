import java.util.Scanner;

public class Program22_BiggestOfFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int a = sc.nextInt();
        System.out.print("Enter b value: ");
        int b = sc.nextInt();
        System.out.print("Enter c value: ");
        int c = sc.nextInt();
        System.out.print("Enter d value: ");
        int d = sc.nextInt();

        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;

        if (max == a && max == b && max == c && max == d) {
            System.out.println("All are equal");
        } else if (max == a) {
            System.out.println("a is biggest");
        } else if (max == b) {
            System.out.println("b is biggest");
        } else if (max == c) {
            System.out.println("c is biggest");
        } else {
            System.out.println("d is biggest");
        }
        sc.close();
    }
}
