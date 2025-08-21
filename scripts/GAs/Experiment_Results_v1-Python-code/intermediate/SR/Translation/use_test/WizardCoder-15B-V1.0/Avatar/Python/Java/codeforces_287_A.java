```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] grid = new int[3][3];
        for (int i = 0; i < 3; i++) {
            String[] line = sc.nextLine().split("");
            for (int j = 0; j < 3; j++) {
                if (line[j].equals("#")) {
                    grid[i][j] = 1;
                } else {
                    grid[i][j] = 0;
                }
            }
        }
        int black = 0;
        int white = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i][j] == 1) {
                    black++;
                } else {
                    white++;
                }
            }
        }
        if (black == 0 || black == 3 || white == 0 || (white == 3) || (white == 4) || (black == 4)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```
