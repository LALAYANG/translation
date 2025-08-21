```java
import java.util.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println(getTurns(a));
    }

    private static int getTurns(int[] a) {
        int levelCount = 0;
        int counterTurns = -1;
        while (levelCount < a.length) {
            counterTurns++;
            for (int i = 0; i < a.length; i++) {
                if (a[i] != -1 && a[i] <= levelCount) {
                    levelCount++;
                    a[i] = -1;
                }
            }
            a = IntStream.range(0, a.length).map(i -> a[a.length - i - 1]).toArray();
        }
        return counterTurns;
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `n` and an array of `n` integers from the input. Then it calls the `getTurns` method which counts the number of turns needed to clear all levels in the array. The `getTurns` method iterates over the array and for each level that is not yet cleared, it increases the `levelCount` and sets the corresponding array element to `-1`. The array is then reversed. The method returns the number of turns.

