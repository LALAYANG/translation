```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[][] games = new int[x - a + 1][y - b + 1];
        int count = 0;
        for (int i = a; i <= x; i++) {
            for (int j = b; j <= y; j++) {
                if (i > j) {
                    games[i - a][j - b] = i;
                    games[j - a][i - b] = j;
                    count++;
                }
            }
        }
        System.out.println(count);
        for (int i = 0; i < x - a + 1; i++) {
            for (int j = 0; j < y - b + 1; j++) {
                if (games[i][j] != 0) {
                    System.out.println(games[i][j] + " " + (games[i][j] - 1));
                }
            }
        }
    }
}
```

