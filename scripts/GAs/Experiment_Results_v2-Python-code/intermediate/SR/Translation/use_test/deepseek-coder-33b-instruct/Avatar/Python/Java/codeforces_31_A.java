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
        for (int index_one = 0; index_one < arr.length; index_one++) {
            for (int index_two = 0; index_two < arr.length; index_two++) {
                if (index_one == index_two) {
                    continue;
                }
                findSumIndices(arr, 0, arr.length, 1, index_one, index_two);
            }
        }
        System.out.println(-1);
    }

    public static void findSumIndices(int[] arr, int k, int stop, int step, int index_one, int index_two) {
        if (step == 0 || (step > 0 && k >= stop) || (step < 0 && k <= stop)) {
            return;
        }
        if (arr[k] != arr[index_two] && arr[k] != arr[index_one] && (arr[k] == arr[index_one] + arr[index_two])) {
            System.out.println((k + 1) + " " + (index_two + 1) + " " + (index_one + 1));
            System.exit(0);
        }
        findSumIndices(arr, k + step, stop, step, index_one, index_two);
    }
}
```

Please note that the Java code does not include the t-test functionality as it is not available in Java's standard library. If you need to perform a t-test, you may need to use a third-party library such as Apache Commons Math.

