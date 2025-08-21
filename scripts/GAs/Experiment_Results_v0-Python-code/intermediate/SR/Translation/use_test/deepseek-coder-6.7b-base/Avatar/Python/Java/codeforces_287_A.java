```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] board = new String[4][4];
        for (int i = 0; i < 4; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < 4; j++) {
                board[i][j] = String.valueOf(line.charAt(j));
            }
        }
        boolean isValid = true;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (board[i][j].equals("#")) {
                    if (i + 1 < 4 && board[i + 1][j].equals("#")) {
                        if (j + 1 < 4 && board[i][j + 1].equals("#")) {
                            if (i + 1 < 4 && j + 1 < 4 && board[i + 1][j + 1].equals("#")) {
                                isValid = false;
                                break;
                            }
                        }
                    }
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

