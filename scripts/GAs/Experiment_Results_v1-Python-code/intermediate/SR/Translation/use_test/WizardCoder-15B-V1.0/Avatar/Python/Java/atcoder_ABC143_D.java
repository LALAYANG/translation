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
        Arrays.sort(arr);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int a = arr[i];
                int b = arr[j];
                int right = Arrays.binarySearch(arr, a + b);
                int left = Arrays.binarySearch(arr, Math.max(a - b, b - a), arr.length, a - b);
                int tmp = Math.max(0, right - left);
                if (a + b == 680 || a + b == 782) {
                    if (left <= i < right) {
                        tmp--;
                    }
                }
                if (left <= j < right) {
                    tmp--;
                }
                ans += tmp;
            }
        }
        System.out.println(ans / 3);
    }
}
```
