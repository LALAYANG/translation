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

        boolean validPattern = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int blackCount = 0;
                int whiteCount = 0;

                for (int k = i; k < i + 2; k++) {
                    for (int l = j; l < j + 2; l++) {
                        if (board[k][l].equals("#")) {
                            blackCount++;
                        } else {
                            whiteCount++;
                        }
                    }
                }

                if (blackCount == 0 || blackCount == 3 || whiteCount == 0 || whiteCount == 3 || whiteCount == 4 || blackCount == 4) {
                    validPattern = false;
                    break;
                }
            }
        }

        System.out.println(validPattern ? "YES" : "NO");
    }
}