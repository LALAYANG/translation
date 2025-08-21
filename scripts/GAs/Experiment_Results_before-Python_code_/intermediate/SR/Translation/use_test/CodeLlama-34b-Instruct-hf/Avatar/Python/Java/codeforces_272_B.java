```java
import java.util.HashMap;
import java.util.Map;

public class PairsWithCommonFX {
    public static void main(String[] args) {
        int[] sequence = {2, 7, 1};
        int result = nPairsWithCommonFX(sequence);
        System.out.println(result);
    }

    public static int nPairsWithCommonFX(int[] sequence) {
        Map<Integer, Integer> storage = new HashMap<>();
        int[] FXs = new int[sequence.length];
        for (int i = 0; i < sequence.length; i++) {
            int value = sequence[i];
            int y = f(value);
            if (!storage.containsKey(y)) {
                storage.put(y, value);
                FXs[i] = y;
            } else {
                storage.put(y, storage.get(y) + value);
            }
        }

        int sum = 0;
        for (int i = 0; i < FXs.length; i++) {
            sum += storage.get(FXs[i]) * storage.get(FXs[i]);
        }

        return (sum - storage.size()) / 2;
    }

    public static int f(int n) {
        int y = 1;
        while (n != 1) {
            if (n % 2 == 1) {
                y += 1;
            }
            n /= 2;
        }
        return y;
    }
}
```
Note: The `f` function in the Python code is not defined in the Java code, so I have defined it as a separate method in the Java code.
