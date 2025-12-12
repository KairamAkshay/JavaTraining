import java.util.Scanner;

public class Program08_UserRegistrationChandrayaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to user's profile");
        System.out.print("Enter user name: ");
        String name = sc.nextLine();
        System.out.print("Enter user age: ");
        int age = Integer.parseInt(sc.nextLine().trim());
        System.out.print("Enter user mail address: ");
        String email = sc.nextLine();
        System.out.print("Enter user role in the mission: ");
        String role = sc.nextLine();
        System.out.print("Enter user salary: ");
        int salary = Integer.parseInt(sc.nextLine().trim());

        System.out.println(name);
        System.out.println(age);
        System.out.println(email);
        System.out.println(role);
        System.out.println(salary);
        sc.close();
    }
}
