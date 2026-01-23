public class Program55_PatternAlphabetDecreasing {
    public static void main(String[] args) {
        int start = 'A';
        int end = 'E';
        for (int x = end; x >= start; x--) {
            for (int y = start; y <= x; y++) {
                System.out.print((char) y);
            }
            System.out.println();
        }
    }
}
