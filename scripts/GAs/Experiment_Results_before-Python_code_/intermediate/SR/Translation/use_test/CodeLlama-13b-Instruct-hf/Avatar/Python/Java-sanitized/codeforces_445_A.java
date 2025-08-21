import java.util.Scanner;

public class codeforces_445_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] board = new char[n][m];
        for (int i = 0; i < n; i++) {
            String row = sc.next();
            for (int j = 0; j < m; j++) {
                if (row.charAt(j) == '.') {
                    if ((i + j) % 2 == 0) {
                        board[i][j] = 'W';
                    } else {
                        board[i][j] = 'B';
                    }
                } else {
                    board[i][j] = row.charAt(j);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}