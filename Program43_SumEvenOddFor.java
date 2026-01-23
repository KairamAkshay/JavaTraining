import java.util.Scanner;

public class Program43_SumEvenOddFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();
        int eSum = 0, oSum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) eSum += i;
            else oSum += i;
        }
        System.out.println(eSum);
        System.out.println(oSum);
        sc.close();
    }
}
