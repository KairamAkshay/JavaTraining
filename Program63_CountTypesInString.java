import java.util.Scanner;

public class Program63_CountTypesInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.println(s);
        int digits = 0, spaces = 0, alphabets = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) digits++;
            if (Character.isSpaceChar(ch)) spaces++;
            if (Character.isLetter(ch)) alphabets++;
        }
        System.out.println("digits = " + digits);
        System.out.println("alphabets = " + alphabets);
        System.out.println("spaces = " + spaces);
        sc.close();
    }
}
