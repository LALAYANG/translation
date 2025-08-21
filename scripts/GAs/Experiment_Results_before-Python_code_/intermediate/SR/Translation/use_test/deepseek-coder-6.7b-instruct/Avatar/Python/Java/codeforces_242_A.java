```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        List<String> games = new ArrayList<>();
        for (int i = a; i <= x; i++) {
            if (i <= b) continue;
            else {
                for (int j = b; j <= y; j++) {
                    if (i > j) {
                        games.add(i + " " + j);
                    }
                }
            }
        }
        System.out.println(games.size());
        for (String game : games) {
            System.out.println(game);
        }
    }
}
```

In this Java code, we use a `Scanner` to read the input. We then create a `List` of `String`s to store the games. We iterate over the range from `a` to `x` (inclusive), and if `i` is less than or equal to `b`, we skip the current iteration. Otherwise, we iterate over the range from `b` to `y` (inclusive), and if `i` is greater than `j`, we add the pair `i` and `j` to the list of games. Finally, we print the size of the list and all its elements.

