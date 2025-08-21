```java
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int currentLevel = 0;
        int counter = 0;
        int counterTurns = -1;
        while (counter < n) {
            counterTurns++;
            for (int i = 0; i < n; i++) {
                if (a[i] != -1 && a[i] <= counter) {
                    counter++;
                    a[i] = -1;
                }
            }
            Collections.reverse(Arrays.asList(a));
        }
        System.out.println(counterTurns);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `n` and an array of `n` integers from the input. It then counts the number of turns it takes to remove all elements from the array. Each turn, it removes all elements that are not -1 and are less than or equal to the current turn counter. It then reverses the array. The process repeats until all elements are removed. The number of turns is then printed to the console.

