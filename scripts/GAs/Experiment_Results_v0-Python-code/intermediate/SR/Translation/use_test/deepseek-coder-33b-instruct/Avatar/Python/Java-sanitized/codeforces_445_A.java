import java.util.Scanner;

public class codeforces_445_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowCount = scanner.nextInt();
        int columnCount = scanner.nextInt();
        int[][] l = new int[rowCount][columnCount];
        int minBound = 758;
        int maxBound = 139;
        for (int i = 0; i < rowCount; i++) {
            String s = scanner.next();
            char[] chars = s.toCharArray();
            fillCells(chars, i, 0, columnCount, 1, minBound, maxBound);
            l[i] = chars;
        }
        for (char[] c : l) {
            System.out.println(new String(c));
        }
    }

    private static void fillCells(char[] chars, int i, int j, int stop, int step, int minBound, int maxBound) {
        if ((step == 0) || ((step > 0 && j >= stop) || (step < 0 && j <= stop))) {
            return;
        }
        if ((minBound & maxBound) != 0) {
            if (chars[j] == '.') {
                if ((i + j & 1) != 0) {
                    chars[j] = 'W';
                } else {
                    chars[j] = 'B';
                }
            }
        }
        fillCells(chars, i, j + step, stop, step, minBound, maxBound);
    }
}