import java.util.Scanner;

public class Program23_StudentCGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter student hall ticket number: ");
        String hallTicket = sc.nextLine();
        System.out.print("Enter student marks in PSPP: ");
        int p = Integer.parseInt(sc.nextLine().trim());
        System.out.print("Enter student marks in MEM: ");
        int m = Integer.parseInt(sc.nextLine().trim());
        System.out.print("Enter student marks in DL: ");
        int d = Integer.parseInt(sc.nextLine().trim());
        System.out.print("Enter student marks in CDE: ");
        int c = Integer.parseInt(sc.nextLine().trim());

        int total = p + m + d + c;
        double avg = total / 4.0;
        double cgpa = (avg / 100.0) * 10.0;

        System.out.println("Total marks = " + total);
        System.out.println("avg = " + avg);
        System.out.println("CGPA = " + cgpa);

        if (cgpa >= 9 && cgpa <= 10) {
            System.out.println("you belong to A+");
        } else if (cgpa >= 8) {
            System.out.println("you belong to A");
        } else if (cgpa >= 7) {
            System.out.println("you belong to B+");
        } else if (cgpa >= 6) {
            System.out.println("you belong to B");
        } else if (cgpa >= 5) {
            System.out.println("you belong to C");
        } else {
            System.out.println("you belong to D");
        }
        sc.close();
    }
}
