import java.util.Scanner;

public class codeforces_445_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[][] chessboard = new String[n][m];
        for (int i = 0; i < n; i++) {
            String currentRow = sc.next();
            for (int j = 0; j < m; j++) {
                if (currentRow.charAt(j) == '.') {
                    if ((i + j) % 2 == 0) {
                        chessboard[i][j] = "W";
                    } else {
                        chessboard[i][j] = "B";
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