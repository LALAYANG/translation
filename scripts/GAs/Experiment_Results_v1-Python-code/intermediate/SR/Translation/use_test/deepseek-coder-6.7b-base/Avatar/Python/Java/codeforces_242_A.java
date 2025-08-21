```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int start_range = scanner.nextInt();
        int b = scanner.nextInt();
        int[][] games = new int[x - start_range + 1][y - b + 1];
        int count = 0;
        for (int i = start_range; i <= x; i++) {
            for (int j = b; j <= y; j++) {
                if (i > j) {
                    games[i - start_range][j - b] = i;
                    games[i - start_range][j - b + 1] = j;
                    count++;
                }
            }
        }
        System.out.println(count);
        for (int i = 0; i < games.length; i++) {
            for (int j = 0; j < games[i].length; j++) {
                if (games[i][j] != 0) {
                    System.out.println(games[i][j] + " " + games[i][j + 1]);
                }
            }
        }
    }
}
```

