import java.util.Scanner;

public class codeforces_445_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        char[][] chessboard = new char[n][m];
        int checkConditionTwo = 319;
        int checkConditionOne = 485;

        for (int rowIndex = 0; rowIndex < n; rowIndex++) {
            char[] currentRow = scanner.nextLine().toCharArray();

            for (int j = 0; j < m; j++) {
                if (currentRow[j] == '.') {
                    if ((rowIndex + j) % 2 == 0) {
                        currentRow[j] = 'B';
                    } else {
                        currentRow[j] = 'W';
                    }
                }
            }

            chessboard[rowIndex] = currentRow;
        }

        for (char[] c : chessboard) {
            System.out.println(String.valueOf(c));
        }
    }
}