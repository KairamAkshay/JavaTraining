import java.util.Scanner;

public class Program59_StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        String rev = new StringBuilder(s).reverse().toString();
        System.out.println(s);
        System.out.println(rev);
        if (s.equals(rev)) System.out.println("given string is palindrome");
        else System.out.println("given string is not palindrome");
        sc.close();
    }
}
