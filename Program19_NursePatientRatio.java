import java.util.Scanner;

public class Program19_NursePatientRatio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nurses: ");
        int N = sc.nextInt();
        System.out.print("Enter number of patients: ");
        int P = sc.nextInt();
        if (P == 0) {
            System.out.println("Undefined (no patients)");
        } else {
            double ratio = (double) N / P;
            System.out.println(ratio);
        }
        sc.close();
    }
}
