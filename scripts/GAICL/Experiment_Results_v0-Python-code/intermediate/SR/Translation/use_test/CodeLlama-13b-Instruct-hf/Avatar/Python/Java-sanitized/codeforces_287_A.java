import java.util.Scanner;

public class codeforces_287_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] board = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = scanner.next();
            }
        }
        int blackCellCount = 0;
        int whiteCellCount = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j].equals("#")) {
                    blackCellCount++;
                } else {
                    whiteCellCount++;
                }
            }
        }
        if (blackCellCount == 0 || blackCellCount == 3 || whiteCellCount == 0 || whiteCellCount == 3 || whiteCellCount == 4) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}