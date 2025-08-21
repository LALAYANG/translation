Here is the Java version of the Python code:

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
        List<int[]> games = new ArrayList<>();
        int condition_one = 760;
        int condition_two = 485;
        for (int current_value = a; current_value <= x; current_value++) {
            if ((condition_one & condition_two) != 0) {
                if (current_value <= b) {
                    continue;
                } else {
                    recursiveLoop(games, current_value, b, y + 1, 1);
                }
            }
        }
        System.out.println(games.size());
        for (int[] current_value : games) {
            System.out.println(current_value[0] + " " + current_value[1]);
        }
    }

    private static void recursiveLoop(List<int[]> games, int current_value, int j, int stop, int step) {
        if (step == 0 || (step > 0 && j >= stop) || (step < 0 && j <= stop)) {
            return;
        }
        if (current_value > j) {
            games.add(new int[]{current_value, j});
        }
        recursiveLoop(games, current_value, j + step, stop, step);
    }
}
```

Please note that Java does not have a direct equivalent to Python's decorator. The `my_decorator` function in the Python code is not used in the Java code.

Also, the `ttest_ind` function from the `scipy.stats` module in Python is not available in Java. If you need to perform a t-test in Java, you would need to implement it yourself or use a library that provides this functionality.

Finally, the `input()` function in Python is equivalent to `Scanner` in Java. It reads a line of input from the user and returns it as a string. The `split()` function is then used to split this string into a list of substrings, based on whitespace. The `map()` function is then used to convert each substring to an integer.

