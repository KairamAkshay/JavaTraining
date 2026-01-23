import java.util.Scanner;

public class Program61_ReplaceAWithDollar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.println(s);
        s = s.replace('a', '$').replace('A', '$');
        System.out.println(s);
        sc.close();
    }
}
