import java.util.Scanner;

public class Program36_SumEvenOddUpToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();
        int i = 1;
        int eSum = 0, oSum = 0;
        while (i <= n) {
            if (i % 2 == 0) eSum += i;
            else oSum += i;
            i++;
        }
        System.out.println("even sum = " + eSum);
        System.out.println("odd sum = " + oSum);
        sc.close();
    }
}
