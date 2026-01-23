import java.util.Scanner;

public class Program64_CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine().toLowerCase();
        int vowel = 0;
        for (char ch : s.toCharArray()) {
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') vowel++;
        }
        System.out.println(vowel);
        sc.close();
    }
}
