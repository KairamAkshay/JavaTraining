import java.util.Scanner;

public class Program28_DirectionSelector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter direction button (1-4): ");
        int d = sc.nextInt();
        switch (d) {
            case 1: System.out.println("direction is north"); break;
            case 2: System.out.println("direction is east"); break;
            case 3: System.out.println("direction is south"); break;
            case 4: System.out.println("direction is west"); break;
            default: System.out.println("sorry! unknown direction try again");
        }
        sc.close();
    }
}
