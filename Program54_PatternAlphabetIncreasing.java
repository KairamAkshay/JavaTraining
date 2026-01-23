public class Program54_PatternAlphabetIncreasing {
    public static void main(String[] args) {
        int start = 'A';
        int end = 'E'; // prints up to ABCDE
        for (int x = start; x <= end; x++) {
            for (int y = start; y <= x; y++) {
                System.out.print((char) y);
            }
            System.out.println();
        }
    }
}
