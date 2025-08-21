import java.util.Scanner;

public class codeforces_445_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String[][] chessboard = new String[n][m];
        int checkConditionOne = 485;
        int checkConditionTwo = 319;
        for (int i = 0; i < n; i++) {
            String currentRow = scanner.nextLine();
            for (int j = 0; j < m; j++) {
                if (checkConditionOne & checkConditionTwo) {
                    if (currentRow.charAt(j) == '.') {
                        if ((i + j) % 2 == 0) {
                            currentRow = currentRow.substring(0, j) + "W" + currentRow.substring(j + 1);
                        } else {
                            currentRow = currentRow.substring(0, j) + "B" + currentRow.substring(j + 1);
                        }
                    }
                }
            }
            chessboard[i] = currentRow;
        }
        for (String[] row : chessboard) {
            System.out.println(String.join("", row));
        }
    }
}