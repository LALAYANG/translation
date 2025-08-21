
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Arrays;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        List<Integer> games = new ArrayList<>();
        for (int i = a; i <= x; i++) {
            if (i <= b) {
                continue;
            } else {
                for (int j = b; j <= y; j++) {
                    if (i > j) {
                        games.add(i);
                        games.add(j);
                    }
                }
            }
        }
        System.out.println(games.size());
        for (int i : games) {
            System.out.println(i);
        }
    }
}
```
This code uses the `Scanner` class to read the input from the user, and the `ArrayList` class to store the list of games. The `for` loop iterates over the range of values from `a` to `x`, and for each value of `i`, it checks if `i` is less than or equal to `b`. If `i` is greater than `b`, it iterates over the range of values from `b` to `y`, and for each value of `j`, it checks if `i` is greater than `j`. If `i` is greater than `j`, it adds the pair `(i, j)` to the list of games. Finally, it prints the size of the list of games and the list of games.

Note that this code assumes that the input is a list of four integers separated by spaces, and that the first three integers represent the values of `x`, `y`, and `a`, and the fourth integer represents the value of `b`.
