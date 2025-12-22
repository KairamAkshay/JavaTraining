import java.util.Scanner;

public class Program21_EmployeeNetSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your basic salary: ");
        double basic = sc.nextDouble();
        double hra, da, tax, allowance;
        if (basic > 57400) {
            hra = basic * 0.10;
            da = basic * 0.70;
            tax = basic * 0.10;
            allowance = 5000;
        } else {
            hra = basic * 0.15;
            da = basic * 1.10;
            tax = basic * 0.05;
            allowance = 2500;
        }
        double netSalary = basic + hra + da + allowance - tax;
        System.out.println(netSalary);
        sc.close();
    }
}
