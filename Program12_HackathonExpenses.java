import java.util.Scanner;

public class Program12_HackathonExpenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total expenditure: ");
        int total = sc.nextInt();
        int perDay = total / 3;
        int perStudentPerDay = total / (30 * 6 * 3); // 30 teams * 6 students * 3 days
        int perStudentAllDays = total / (30 * 6);
        System.out.println("The amount spent per day = " + perDay);
        System.out.println("The amount spent on each student per day = " + perStudentPerDay);
        System.out.println("The amount spent on each student for all 3 days = " + perStudentAllDays);
        sc.close();
    }
}
