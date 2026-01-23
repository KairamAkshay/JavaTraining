import java.util.Scanner;

public class Program60_StringLengthManual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        int count = 0;
        for (char ch : s.toCharArray()) count++;
        System.out.println(count);
        sc.close();
    }
}
