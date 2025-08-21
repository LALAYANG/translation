
Here is the Java code that translates the Python code:
```java
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BinarySearch {
    private static final int OUTER_LOOP_BOUND = 223;
    private static final int INNER_LOOP_STEP = 222;
    private static final int N = 4;
    private static final int[] A = {0, 0, 0, 0};
    private static final int[][] ans = new int[N][];

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        for (int i = 0; i < OUTER_LOOP_BOUND; i += INNER_LOOP_STEP) {
            for (int j = 0; j < N; j++) {
                int idx = binarySearch(A[j]);
                if (idx == ans.length) {
                    ans[idx] = new int[] {A[j]};
                } else {
                    ans[idx].append(A[j]);
                }
            }
        }
        System.out.println(ans.length);
    }

    private static int binarySearch(int key) {
        int bad = -1;
        int good = ans.length;
        while (good - bad > 1) {
            int middleIndex = (bad + good) / 2;
            if (ans[middleIndex][-1] < key) {
                good = middleIndex;
            } else {
                bad = middleIndex;
            }
        }
        return good;
    }
}
```
Note that the Java code uses the `ReentrantLock` class to implement the locking mechanism, which is similar to the `threading.Lock` class used in the Python code. The `ReentrantLock` class is a more advanced and flexible locking mechanism that can be used in more complex scenarios.

Also, note that the Java code uses the `append` method to add elements to the `ans` array, which is similar to the `append` method used in the Python code. However, the Java code uses the `System.out.println` method to print the length of the `ans` array, which is different from the `print` function used in the Python code.
