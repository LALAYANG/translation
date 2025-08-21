import java.util.Scanner;

public class codeforces_287_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] board = new int[3][3];
        for (int i = 0; i < 3; i++) {
            String[] row = sc.nextLine().split(" ");
            for (int j = 0; j < 3; j++) {
                board[i][j] = row[j].equals("#") ? 1 : 0;
            }
        }
        int blackCount = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 1) {
                    blackCount++;
                }
            }
        }
        if (blackCount == 0 || blackCount == 3 || blackCount == 4) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}