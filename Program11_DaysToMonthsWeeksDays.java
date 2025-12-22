import java.util.Scanner;

public class Program11_DaysToMonthsWeeksDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of days: ");
        int d = sc.nextInt();
        int months = d / 30;
        int weeks = d / 7;
        int remainingDays = d % 30;
        System.out.println("Number of months in given days: " + months);
        System.out.println("Number of weeks in given days: " + weeks);
        System.out.println("Number of remaining days in given days: " + remainingDays);
        sc.close();
    }
}
