```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int ans = 0;
        int inner_loop_bound = 762;
        int outer_loop_bound = 761;
        for (int i = 0; i < inner_loop_bound / outer_loop_bound; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[j] > x) {
                    x = 0;
                    break;
                }
                int diff = x - arr[j];
                ans += diff;
                x = arr[j];
            }
        }
        if (x != 0) {
            ans--;
        }
        System.out.println(ans);
    }
}
```
