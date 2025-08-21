```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_elements = sc.nextInt();
        int num_queries = sc.nextInt();
        int sa = 0;
        for (int i = 0; i < num_elements; i++) {
            if (sc.next().equals("-")) {
                sa++;
            }
        }
        int[] arr = new int[num_elements];
        for (int i = 0; i < num_elements; i++) {
            arr[i] = i;
        }
        Arrays.sort(arr);
        int[] dp = new int[num_elements];
        for (int i = 0; i < num_elements; i++) {
            dp[i] = i;
        }
        for (int i = 1; i < num_elements; i++) {
            dp[i] = dp[i - 1] + arr[i];
        }
        for (int i = 0; i < num_queries; i++) {
            int value_a = sc.nextInt();
            int b = sc.nextInt();
            int index = Arrays.binarySearch(dp, b);
            if (index < 0) {
                index = -index - 1;
            }
            if (index == 0) {
                System.out.println(1);
            } else if (index == num_elements) {
                System.out.println(0);
            } else {
                int left = dp[index - 1];
                int right = dp[index];
                if (left <= value_a && value_a <= right) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }
        }
    }
}
```
