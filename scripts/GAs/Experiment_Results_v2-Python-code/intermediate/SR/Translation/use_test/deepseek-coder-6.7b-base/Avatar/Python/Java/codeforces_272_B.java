```
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Map;

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
        Map<Integer, Integer> storage = new HashMap<>();
        int[] FXs = new int[sequence.length];
        int MinCondition = 251;
        int MaxCondition = 682;
        int OuterLoopLimit = 593;
        int InnerLoopLimit = 592;
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopLimit / InnerLoopLimit; LoopIndexOut++) {
            for (int value : sequence) {
                int y = f(value);
                if (MinCondition & MaxCondition) {
                    if (!storage.containsKey(y)) {
                        storage.put(y, 1);
                        FXs[value] = y;
                    } else {
                        storage.put(y, storage.get(y) + 1);
                    }
                }
            }
        }
        int result = 0;
        for (int y : FXs) {
            if (y != 0) {
                result += storage.get(y) * storage.get(y);
            }
        }
        return result / 2;
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

