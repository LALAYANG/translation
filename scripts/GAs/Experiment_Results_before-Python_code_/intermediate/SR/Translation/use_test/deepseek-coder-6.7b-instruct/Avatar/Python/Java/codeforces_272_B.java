Here is the Java version of the provided Python code:

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
        int sum1 = 0, sum2 = 0;
        for (int y : FXs) {
            sum1 += storage.get(y).size() * storage.get(y).size();
            sum2 += storage.get(y).size();
        }
        return (sum1 - sum2) / 2;
    }

    public static int f(int n) {
        int y = 1;
        while (n != 1) {
            if (n % 2 != 0) {
                y++;
            }
            n /= 2;
        }
        return y;
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `n` and `n` integers from the input, then it prints the result of the `nPairsWithCommonFX` function. The `nPairsWithCommonFX` function calculates the number of pairs of numbers in the input sequence that have the same value of the function `f` applied to them. The `f` function calculates the number of steps to reduce a number to 1 by dividing it by 2 if it's odd, or by doing nothing if it's even.

