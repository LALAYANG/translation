import java.util.Scanner;

public class codeforces_445_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        char[][] chessboard = new char[n][m];
        for (int i = 0; i < n; i++) {
            String row = scanner.next();
            for (int j = 0; j < m; j++) {
                chessboard[i][j] = row.charAt(j);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (chessboard[i][j] == '.') {
                    if ((i + j) % 2 == 0) {
                        chessboard[i][j] = 'B';
                    } else {
                        chessboard[i][j] = 'W';
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(chessboard[i][j]);
            }
            System.out.println();
        }
    }
}