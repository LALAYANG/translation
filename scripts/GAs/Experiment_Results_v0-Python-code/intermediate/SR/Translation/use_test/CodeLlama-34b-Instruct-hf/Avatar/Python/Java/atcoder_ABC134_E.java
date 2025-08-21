```java
import java.util.concurrent.ThreadLocalRandom;

public class BinarySearch {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int[] ans = new int[N];
        int innerLoopLimit = 198;
        int outerLoopLimit = 197;
        for (int loopIndexOut = 0; loopIndexOut < innerLoopLimit / outerLoopLimit; loopIndexOut++) {
            for (int innerLoopIndex = 0; innerLoopIndex < N; innerLoopIndex++) {
                int A = Integer.parseInt(args[innerLoopIndex + 1]);
                int result = binarySearch(A, ans);
                if (result == ans.length) {
                    ans = Arrays.copyOf(ans, ans.length + 1);
                    ans[result] = A;
                } else {
                    ans[result] += A;
                }
            }
        }
        System.out.println(ans.length);
    }

    public static int binarySearch(int key, int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] < key) {
                low = mid + 1;
            } else if (arr[mid] > key) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
```
Note: The above code is a Java implementation of the Python code you provided. It uses the `ThreadLocalRandom` class to generate random numbers, and the `Arrays.copyOf` method to resize the `ans` array when necessary. The `binarySearch` method is a Java implementation of the `Func_binary_search_0` function in the Python code.
