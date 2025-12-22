import java.util.Scanner;

public class Program30_WeekdaySwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day (1-7): ");
        int day = sc.nextInt();
        switch (day) {
            case 1: System.out.println("today is Monday"); break;
            case 2: System.out.println("today is Tuesday"); break;
            case 3: System.out.println("today is Wednesday"); break;
            case 4: System.out.println("today is Thursday"); break;
            case 5: System.out.println("today is Friday"); break;
            case 6: System.out.println("today is Saturday"); break;
            case 7: System.out.println("today is Sunday"); break;
            default: System.out.println("You entered an invalid day");
        }
        sc.close();
    }
}
