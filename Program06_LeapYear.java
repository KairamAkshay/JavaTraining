import java.util.Scanner;

public class Program06_LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        boolean isLeap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        if (isLeap) {
            System.out.println("It is a leap year");
        } else {
            System.out.println("It is not a leap year");
        }
        sc.close();
    }
}
