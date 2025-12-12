import java.util.Scanner;

public class Program01_VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You are eligible for voting");
        }
        System.out.println("Program end");
        sc.close();
    }
}
