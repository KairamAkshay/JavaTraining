import java.util.Scanner;

public class Program62_LargestStringManualCount {
    private static int manualLen(String s) {
        int c = 0;
        for (char ch : s.toCharArray()) c++;
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();
        int c1 = manualLen(s1);
        int c2 = manualLen(s2);
        if (c1 > c2) System.out.println("str1 is largest string");
        else if (c2 > c1) System.out.println("str2 is largest string");
        else System.out.println("Both strings have equal length");
        sc.close();
    }
}
