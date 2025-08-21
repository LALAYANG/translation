import java.util.Scanner;

public class codeforces_287_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] board = new String[4][4];

        for (int i = 0; i < 4; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < 4; j++) {
                board[i][j] = String.valueOf(line.charAt(j));
            }
        }

        int blackCount = 0;
        int whiteCount = 0;
        boolean validPattern = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j].equals("#")) {
                    blackCount++;
                } else {
                    whiteCount++;
                }

                if (board[i][j + 1].equals("#")) {
                    blackCount++;
                } else {
                    whiteCount++;
                }

                if (board[i + 1][j].equals("#")) {
                    blackCount++;
                } else {
                    whiteCount++;
                }

                if (board[i + 1][j + 1].equals("#")) {
                    blackCount++;
                } else {
                    whiteCount++;
                }

                if (blackCount == 0 || blackCount == 3 || whiteCount == 0 || whiteCount == 3 || whiteCount == 4 || blackCount == 4) {
                    validPattern = false;
                    break;
                }

                blackCount = 0;
                whiteCount = 0;
            }
        }

        if (validPattern) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}