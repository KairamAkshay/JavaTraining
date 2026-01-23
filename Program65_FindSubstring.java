import java.util.Scanner;

public class Program65_FindSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string (to find): ");
        String str2 = sc.nextLine();
        if (str1.indexOf(str2) == -1) {
            System.out.println("string is not available");
        } else {
            System.out.println("string is available");
        }
        sc.close();
    }
}
