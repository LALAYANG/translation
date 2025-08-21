Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        int[] arr = new int[y];
        for (int i = 0; i < y; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int indexOne = 0; indexOne < arr.length; indexOne++) {
            for (int indexTwo = 0; indexTwo < arr.length; indexTwo++) {
                if (indexOne == indexTwo) {
                    continue;
                }
                findSumIndices(arr, indexOne, indexTwo);
            }
        }
        System.out.println(-1);
    }

    private static void findSumIndices(int[] arr, int indexOne, int indexTwo) {
        for (int k = 0; k < arr.length; k++) {
            if (k == indexOne || k == indexTwo) {
                continue;
            }
            if (arr[k] == arr[indexOne] + arr[indexTwo]) {
                System.out.println((k + 1) + " " + (indexTwo + 1) + " " + (indexOne + 1));
                System.exit(0);
            }
        }
    }
}
```

This Java code does the same thing as your Python code. It reads an integer `y` and an array of `y` integers from the input. Then it iterates over the array and for each pair of distinct indices, it checks if there is another index `k` such that `arr[k] == arr[indexOne] + arr[indexTwo]`. If such an index `k` is found, it prints `k + 1`, `indexTwo + 1`, and `indexOne + 1` and exits. If no such indices are found for all pairs of distinct indices, it prints `-1`.

