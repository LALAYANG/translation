```java
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        String[][] t = new String[4][4];
        int black_cell_count = 0;
        int white = 0;
        int correct = 0;
        for (int i = 0; i < 4; i++) {
            String[] input = input().split(" ");
            for (int j = 0; j < 4; j++) {
                t[i] = input;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (t[i][j].equals("#")) {
                    black_cell_count++;
                } else {
                    white++;
                }
                if (t[i][j + 1].equals("#")) {
                    black_cell_count++;
                } else {
                    white++;
                }
                if (t[i + 1][j].equals("#")) {
                    black_cell_count++;
                } else {
                    white++;
                }
                if (t[i + 1][j + 1].equals("#")) {
                    black_cell_count++;
                } else {
                    white++;
                }
                if (black_cell_count == 0 || black_cell_count == 3 || white == 0 || white == 3 || black_cell_count == 4) {
                    correct = 1;
                    break;
                }
                black_cell_count = 0;
                white = 0;
            }
        }
        if (correct == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

Test input:
.#.#
#.#.
#.#.
.#.#

Expected output:
NO 
