import java.util.Scanner;

public class Program31_UniversitySalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();
        System.out.print("Enter employee Id: ");
        String id = sc.nextLine();
        System.out.print("Enter employee department: ");
        String dept = sc.nextLine().trim();
        System.out.print("Enter employee designation: ");
        String design = sc.nextLine().trim().toLowerCase();
        System.out.print("Enter employee qualification: ");
        String qualification = sc.nextLine().trim().toLowerCase();

        double basic = 0, hra = 0, da = 0, tax = 0, allow = 0;

        if (design.equals("assistant professor") && qualification.equals("without phd") && dept.equalsIgnoreCase("CSE")) {
            basic = 21600;
            hra = basic * 0.12;
            da  = basic * 1.10;
            tax = basic * 0.05;
            allow = 2500;
        } else if (design.equals("assistant professor") && (qualification.equals("phd") || qualification.equals("with phd")) && dept.equalsIgnoreCase("CSE")) {
            basic = 57600;
            hra = basic * 0.10;
            da  = basic * 0.60;
            tax = basic * 0.10;
            allow = 2500;
        } else if (design.equals("associate professor") && (qualification.equals("phd") || qualification.equals("with phd")) && dept.equalsIgnoreCase("CSE")) {
            basic = 131400;
            hra = basic * 0.08;
            da  = basic * 0.10;
            tax = basic * 0.15;
            allow = 10000;
        } else if (design.equals("professor") && (qualification.equals("phd") || qualification.equals("with phd")) && dept.equalsIgnoreCase("CSE")) {
            basic = 144200;
            hra = 0;
            da  = basic * 0.08;
            tax = basic * 0.20;
            allow = 10000;
        } else if (design.equals("sr professor") && (qualification.equals("phd") || qualification.equals("with phd")) && dept.equalsIgnoreCase("CSE")) {
            basic = 180000;
            hra = 0;
            da  = basic * 0.06;
            tax = basic * 0.25;
            allow = 1500;
        } else {
            System.out.println("No matching rule; cannot compute.");
            sc.close();
            return;
        }

        double net = basic + hra + da + allow - tax;
        System.out.println("net salary = " + net);
        sc.close();
    }
}
