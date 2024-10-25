import java.util.Scanner;

public class codeforces_287_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] board = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int black = 0;
        int white = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 1) {
                    black++;
                } else {
                    white++;
                }
                if (board[i][j + 1] == 1) {
                    black++;
                } else {
                    white++;
                }
                if (board[i + 1][j] == 1) {
                    black++;
                } else {
                    white++;
                }
                if (board[i + 1][j + 1] == 1) {
                    black++;
                } else {
                    white++;
                }
                if (black == 0 || black == 3 || white == 0 || white == 3 || white == 4 || black == 4) {
                    System.out.println("YES");
                    return;
                }
                black = 0;
                white = 0;
            }
        }
        System.out.println("NO");
    }
}