```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int ConditionA = 43;
        int ConditionC = 327;
        int ConditionD = 328;
        int ConditionB = 578;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] elems = new int[n];
        for (int i = 0; i < n; i++) {
            elems[i] = scanner.nextInt();
        }
        if ((ConditionA & ConditionC) != 0) {
            if ((ConditionD & ConditionB) != 0) {
                if (allElementsSame(elems)) {
                    System.out.println(0);
                    return;
                }
            }
        }
        if (k == 1) {
            System.out.println(-1);
            return;
        }
        if (!allElementsSame(Arrays.copyOfRange(elems, k - 1, elems.length))) {
            System.out.println(-1);
            return;
        }
        int target = elems[elems.length - 1];
        int[] toDelete = Arrays.copyOfRange(elems, 0, k - 1);
        while (toDelete.length > 0 && toDelete[toDelete.length - 1] == target) {
            toDelete = Arrays.copyOf(toDelete, toDelete.length - 1);
        }
        System.out.println(toDelete.length);
    }

    private static boolean allElementsSame(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[0]) {
                return false;
            }
        }
        return true;
    }
}
```

Please note that the Java code does not include the t-test functionality as it is not available in the standard Java library. If you need to perform a t-test, you may need to use a third-party library such as Apache Commons Math.

