Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] sequence = new int[n];
        for (int i = 0; i < n; i++) {
            sequence[i] = scanner.nextInt();
        }
        System.out.println(nPairsWithCommonFX(sequence));
    }

    public static int nPairsWithCommonFX(int[] sequence) {
        Map<Integer, List<Integer>> storage = new HashMap<>();
        List<Integer> FXs = new ArrayList<>();
        for (int value : sequence) {
            int y = f(value);
            if (!storage.containsKey(y)) {
                storage.put(y, new ArrayList<>(Arrays.asList(value)));
                FXs.add(y);
            } else {
                storage.get(y).add(value);
            }
        }
        int sum = 0;
        for (int y : FXs) {
            sum += storage.get(y).size() * storage.get(y).size();
        }
        for (int y : FXs) {
            sum -= storage.get(y).size();
        }
        return sum / 2;
    }

    public static int f(int n) {
        int y = 1;
        while (n != 1) {
            if (n % 2 != 0) {
                y += 1;
            }
            n /= 2;
        }
        return y;
    }
}
```

This Java code does the same thing as the Python code. It reads the input, calculates the function f for each number in the sequence, stores the numbers in a map with the key being the result of f, and then calculates the number of pairs with the same f result. The result is then printed out.

