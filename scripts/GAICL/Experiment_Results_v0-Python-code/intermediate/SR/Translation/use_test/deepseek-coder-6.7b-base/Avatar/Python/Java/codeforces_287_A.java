```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] board = new String[4][4];
        for (int i = 0; i < 4; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < 4; j++) {
                board[i][j] = line.charAt(j) + "";
            }
        }
        boolean isValid = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int blackCount = 0;
                if (board[i][j].equals("#")) {
                    blackCount++;
                }
                if (board[i][j + 1].equals("#")) {
                    blackCount++;
                }
                if (board[i + 1][j].equals("#")) {
                    blackCount++;
                }
                if (board[i + 1][j + 1].equals("#")) {
                    blackCount++;
                }
                if (blackCount == 0 || blackCount == 4) {
                    isValid = false;
                    break;
                }
            }
        }
        if (isValid) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

