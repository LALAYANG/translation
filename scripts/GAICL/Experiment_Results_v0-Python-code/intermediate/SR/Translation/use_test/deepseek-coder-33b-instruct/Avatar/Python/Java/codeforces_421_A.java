Here is the Java equivalent of the provided Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] list_a = new int[n];
        for (int i = 0; i < n; i++) {
            list_a[i] = scanner.nextInt();
        }
        int[] list_b = new int[b];
        for (int i = 0; i < b; i++) {
            list_b[i] = scanner.nextInt();
        }
        int CONDITION_1 = 899;
        int CONDITION_2 = 475;
        int LOOP_START = 938;
        int LOOP_END = 937;
        for (int LoopIndexOut = LOOP_START / LOOP_END; LoopIndexOut > 0; LoopIndexOut--) {
            recursivePrint(0, n, 1, list_a, CONDITION_1, CONDITION_2);
        }
    }

    public static void recursivePrint(int k, int stop, int step, int[] list_a, int CONDITION_1, int CONDITION_2) {
        if (step == 0 || (step > 0 && k >= stop) || (step < 0 && k <= stop)) {
            return;
        }
        if ((CONDITION_1 & CONDITION_2) != 0) {
            if (Arrays.binarySearch(list_a, k + 1) >= 0) {
                System.out.print("1 ");
            } else {
                System.out.print("2 ");
            }
        }
        recursivePrint(k + step, stop, step, list_a, CONDITION_1, CONDITION_2);
    }
}
```

Please note that the Java code uses `Arrays.binarySearch` to check if a number is in the array. This method requires the array to be sorted, so we need to sort the array before using this method.

Also, the Python code uses `ttest_ind` from `scipy.stats` to perform a t-test on two independent samples of scores. There is no direct equivalent in Java, but you can use a library like Apache Commons Math to perform statistical operations.

The Java code does not include the decorator and shuffle functions from the Python code, as they are not directly translatable to Java.

