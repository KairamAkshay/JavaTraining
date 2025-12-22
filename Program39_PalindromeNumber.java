import java.util.Scanner;

public class Program39_PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();
        int temp = n;
        int rev = 0;
        while (temp > 0) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp /= 10;
        }
        if (rev == n) {
            System.out.println("given number is palindrome");
        } else {
            System.out.println("given number is not palindrome");
        }
        sc.close();
    }
}
