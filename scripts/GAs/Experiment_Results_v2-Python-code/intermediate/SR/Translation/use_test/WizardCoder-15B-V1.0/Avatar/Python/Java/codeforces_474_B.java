```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] queries = new int[m];
        for (int i = 0; i < m; i++) {
            queries[i] = sc.nextInt();
        }
        int[] result = new int[m];
        for (int i = 0; i < m; i++) {
            int current_index = queries[i] - 1;
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += arr[j];
            }
            result[i] = sum;
        }
        for (int i = 0; i < m; i++) {
            System.out.println(result[i]);
        }
    }
}
```
