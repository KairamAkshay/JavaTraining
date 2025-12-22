import java.util.Scanner;

public class Program32_PrintName10Times {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        int i = 1;
        while (i <= 10) {
            System.out.println(name);
            i++;
        }
        sc.close();
    }
}
