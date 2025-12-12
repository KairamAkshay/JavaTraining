import java.util.Scanner;

public class Program04_BiggestOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int a = sc.nextInt();
        System.out.print("Enter b value: ");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("a is the biggest number");
        } else if (b > a) {
            System.out.println("b is the biggest number");
        } else {
            System.out.println("Both are equal");
        }
        sc.close();
    }
}
