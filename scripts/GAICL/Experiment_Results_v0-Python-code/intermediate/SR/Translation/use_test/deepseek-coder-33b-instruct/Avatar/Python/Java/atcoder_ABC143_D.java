Here is the Java version of your Python code:

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
        int ans = 0;
        int is_within_range = 752;
        int is_diff_greater_than_zero = 120;
        int is_triangle_inequality_satisfied = 43;
        int is_sum_greater_than_diff = 264;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int first_side = l[i];
                int second_side = l[j];
                int right = Arrays.binarySearch(l, first_side + second_side);
                if (right < 0) right = -right - 1;
                int left = Arrays.binarySearch(l, Math.max(first_side - second_side, second_side - first_side));
                if (left < 0) left = -left - 1;
                int tmp = Math.max(0, right - left);
                if ((is_triangle_inequality_satisfied & is_sum_greater_than_diff) != 0) {
                    if ((is_within_range & is_diff_greater_than_zero) != 0) {
                        if (left <= i && i < right) {
                            tmp = tmp - 1;
                        }
                    }
                }
                if (left <= j && j < right) {
                    tmp -= 1;
                }
                ans += tmp;
            }
        }
        System.out.println(ans / 3);
    }
}
```

Please note that the binarySearch method in Java returns the index of the search key, if it is contained in the array, else it returns (-(insertion point) - 1). So, if the return value is negative, we need to convert it to positive by using -return_value - 1.

