```java
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

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
        int MinCondition = 251;
        int MaxCondition = 682;
        int OuterLoopLimit = 593;
        int InnerLoopLimit = 592;
        int[] storage = new int[OuterLoopLimit];
        int[] FXs = new int[OuterLoopLimit];
        int count = 0;
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopLimit / InnerLoopLimit; LoopIndexOut++) {
            for (int value : sequence) {
                int y = f(value);
                if ((MinCondition & MaxCondition) != 0) {
                    if (storage[y] == 0) {
                        storage[y] = value;
                        FXs[count] = y;
                        count++;
                    } else {
                        storage[y]++;
                    }
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += storage[FXs[i]] * (storage[FXs[i] - 1] - 1);
        }
        return sum / 2;
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

Test input:
2
7 1

Expected output:
0 
