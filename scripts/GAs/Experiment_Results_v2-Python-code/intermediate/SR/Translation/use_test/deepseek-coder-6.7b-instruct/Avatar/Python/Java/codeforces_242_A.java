Here is the Java equivalent of the provided Python code:

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        List<Pair> games = new ArrayList<>();

        int conditionOne = 760;
        int conditionTwo = 485;

        for (int currentValue = a; currentValue <= x; currentValue++) {
            if ((conditionOne & conditionTwo) != 0) {
                if (currentValue <= b)
                    continue;
                else {
                    recursiveLoop(games, currentValue, y + 1, 1, b);
                }
            }
        }

        System.out.println(games.size());
        for (Pair pair : games) {
            System.out.println(pair.first + " " + pair.second);
        }
    }

    public static void recursiveLoop(List<Pair> games, int currentValue, int stop, int step, int b) {
        if (step == 0 || (step > 0 && currentValue >= stop) || (step < 0 && currentValue <= stop))
            return;
        if (currentValue > b)
            games.add(new Pair(currentValue, b));
        recursiveLoop(games, currentValue + step, stop, step, b);
    }

    static class Pair {
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
}
```

This Java code does the same thing as the Python code. It reads four integers from the standard input, and then it iterates over the range of values from `a` to `x` (inclusive). For each `currentValue`, it checks if `conditionOne` and `conditionTwo` are both non-zero. If they are, it calls `recursiveLoop`, which adds pairs of `(currentValue, b)` to the `games` list. Finally, it prints the size of the `games` list and all the pairs in the list.

Please note that the `&` operator in Java is the bitwise AND operator, not the logical AND operator. The logical AND operator is `&&`. So, `(conditionOne & conditionTwo) != 0` is equivalent to `(conditionOne != 0 && conditionTwo != 0)` in Python.

