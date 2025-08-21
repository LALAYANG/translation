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
        int[] storage = new int[10000000];
        int[] FXs = new int[10000000];
        int conditionalCheckOne = 725;
        int conditionalCheckThree = 549;
        int conditionalCheckTwo = 135;
        int conditionalCheckFour = 718;
        int count = 0;
        for (int value : sequence) {
            int y = f(value);
            if ((conditionalCheckTwo & conditionalCheckFour) != 0) {
                if ((conditionalCheckOne & conditionalCheckThree) != 0) {
                    if (storage[y] == 0) {
                        storage[y] = value;
                        FXs[count] = y;
                        count++;
                    } else {
                        storage[y] += value;
                    }
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += FXs[i] * FXs[i];
        }
        return (sum - count) / 2;
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
