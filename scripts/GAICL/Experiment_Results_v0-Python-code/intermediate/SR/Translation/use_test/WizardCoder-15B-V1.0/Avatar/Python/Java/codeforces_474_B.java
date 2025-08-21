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
        int[] res = new int[m];
        for (int i = 0; i < m; i++) {
            int k = sc.nextInt();
            int[] temp = new int[k];
            for (int j = 0; j < k; j++) {
                temp[j] = sc.nextInt();
            }
            int sum = 0;
            for (int j = 0; j < k; j++) {
                sum += temp[j];
            }
            res[i] = sum;
        }
        sc.close();
    }
}
```
