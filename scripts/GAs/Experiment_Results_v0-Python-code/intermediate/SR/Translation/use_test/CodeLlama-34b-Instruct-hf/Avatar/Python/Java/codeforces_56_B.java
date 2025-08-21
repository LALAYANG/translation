```java
import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.Thread;

public class ConcatenateArrays {
    public static void main(String[] args) {
        int arraySize = Integer.parseInt(args[0]);
        int[] A = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            A[i] = Integer.parseInt(args[i + 1]);
        }

        int mn = arraySize + 1;
        int mx = -1;
        for (int i = 0; i < arraySize; i++) {
            if (A[i] + 1 != A[i + 1]) {
                mn = Math.min(mn, i);
                mx = Math.max(mx, i);
            }
        }

        if (mx == -1) {
            System.out.println("0 0");
            return;
        }

        int[] subArrayPrefix = Arrays.copyOfRange(A, 0, mn);
        int[] variable317 = Arrays.copyOfRange(A, mx + 1, arraySize);
        int[] variable617 = Arrays.copyOfRange(A, mn, mx + 1);
        int[] subArrayOriginal = Arrays.copyOfRange(A, mn, mx + 1);

        if (isSorted(subArrayOriginal)) {
            System.out.println(mn + 1 + " " + mx + 1);
        } else {
            System.out.println("0 0");
        }
    }

    private static boolean isSorted(int[] A) {
        for (int i = 1; i < A.length; i++) {
            if (A[i - 1] > A[i]) {
                return false;
            }
        }
        return true;
    }
}
```
Note: The above code is a Java implementation of the Python code you provided. It uses the `Arrays` class to perform the necessary array operations, and the `Math` class to perform the necessary mathematical operations. The `isSorted` method is used to check if the sub-array is sorted or not.
