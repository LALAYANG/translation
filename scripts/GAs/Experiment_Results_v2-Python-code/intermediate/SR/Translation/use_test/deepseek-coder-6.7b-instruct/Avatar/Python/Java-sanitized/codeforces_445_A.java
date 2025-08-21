import java.util.Scanner;

public class codeforces_445_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();

        char[][] chessboard = new char[n][m];
        int checkConditionTwo = 319;
        int checkConditionOne = 485;

        for (int rowIndex = 0; rowIndex < n; rowIndex++) {
            String currentRow = scanner.nextLine();
            char[] currentRowChars = currentRow.toCharArray();

            fillRow(currentRowChars, m, 1, rowIndex, checkConditionTwo, checkConditionOne);

            chessboard[rowIndex] = currentRowChars;
        }

        for (char[] c : chessboard) {
            System.out.println(new String(c));
        }
    }

    private static void fillRow(char[] currentRow, int m, int step, int rowIndex, int checkConditionTwo, int checkConditionOne) {
        if (step == 0 || (step > 0 && m >= step) || (step < 0 && m <= step)) {
            return;
        }
        if ((checkConditionTwo & checkConditionOne) != 0) {
            if (currentRow[m] == '.') {
                if ((rowIndex + m) % 2 == 0) {
                    currentRow[m] = 'B';
                } else {
                    currentRow[m] = 'W';
                }
            }
        }
        fillRow(currentRow, m + step, step, rowIndex, checkConditionTwo, checkConditionOne);
    }
}