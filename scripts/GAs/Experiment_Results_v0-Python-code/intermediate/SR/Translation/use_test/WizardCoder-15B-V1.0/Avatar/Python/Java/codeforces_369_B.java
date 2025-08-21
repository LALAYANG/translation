```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int unused_variable = sc.nextInt();
        int r = sc.nextInt();
        int total_set_size = sc.nextInt();
        int sk = sc.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }

        int[] result = new int[r];
        for (int i = 0; i < r; i++) {
            int[] subset = new int[k];
            for (int j = 0; j < k; j++) {
                subset[j] = nums[j + i * k];
            }
            Arrays.sort(subset);
            result[i] = subset[k // 2];
        }

        System.out.println(Arrays.toString(result));
    }
}
```
