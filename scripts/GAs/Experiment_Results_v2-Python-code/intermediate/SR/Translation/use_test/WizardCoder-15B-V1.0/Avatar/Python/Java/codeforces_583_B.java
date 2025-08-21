```java
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] a = new int[n];
        String[] input = args[1].split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(input[i]);
        }
        int currentLevel = 0;
        int levelCount = 0;
        int counterTurns = -1;
        while (levelCount < n) {
            counterTurns++;
            for (int i = 0; i < n; i++) {
                if (a[i] != -1 && a[i] <= currentLevel) {
                    levelCount++;
                    a[i] = -1;
                }
            }
            Arrays.sort(a);
            for (int i = 0; i < n; i++) {
                if (a[i] != -1) {
                    a[i] = currentLevel + 1;
                }
            }
            currentLevel++;
        }
        System.out.println(counterTurns);
    }
}
```
