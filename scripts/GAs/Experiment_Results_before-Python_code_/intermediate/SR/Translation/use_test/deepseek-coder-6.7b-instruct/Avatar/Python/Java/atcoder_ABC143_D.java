```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
        }
        Arrays.sort(l);
        long ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int a = l[i];
                int b = l[j];
                int right = binarySearchRight(l, a + b);
                int left = binarySearchLeft(l, Math.max(a - b, b - a));
                long tmp = Math.max(0, right - left);
                if (left <= i && i < right) {
                    tmp -= 1;
                }
                if (left <= j && j < right) {
                    tmp -= 1;
                }
                ans += tmp;
            }
        }
        System.out.println(ans / 3);
    }

    private static int binarySearchRight(int[] arr, int key) {
        int lo = 0;
        int hi = arr.length;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] <= key) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    private static int binarySearchLeft(int[] arr, int key) {
        int lo = 0;
        int hi = arr.length;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] < key) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `n` and `n` integers from the input, sorts them, and then iterates over all pairs of integers (`a`, `b`) in the sorted list. For each pair, it calculates the number of elements `c` in the list such that `a` < `c` < `b` and `a` + `c` <= `b`. It then adds this number to the total sum `ans`. Finally, it prints `ans` divided by 3.

