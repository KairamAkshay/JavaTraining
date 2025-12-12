import java.util.Scanner;

public class Program07_HospitalPatientDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Apola Hospital");
        System.out.print("Enter patient name: ");
        String name = sc.nextLine();
        System.out.print("Enter patient age: ");
        String age = sc.nextLine();
        System.out.print("Enter patient gender: ");
        String gender = sc.nextLine();
        System.out.print("Enter patient medical condition: ");
        String condition = sc.nextLine();

        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(condition);
        sc.close();
    }
}
