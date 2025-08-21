```
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        List<String> games = new ArrayList<>();
        for (int i = a; i <= x; i++) {
            if (i <= b) {
                continue;
            }
            for (int j = b; j <= y; j++) {
                games.add(i + " " + j);
            }
        }
        Collections.shuffle(games);
        System.out.println(games.size());
        for (String game : games) {
            System.out.println(game);
        }
    }
}
```

