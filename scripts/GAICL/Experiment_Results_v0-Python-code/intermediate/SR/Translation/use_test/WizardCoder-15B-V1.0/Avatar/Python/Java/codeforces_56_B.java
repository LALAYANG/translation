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
        int mn = n + 1, mx = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                mn = Math.min(mn, i);
                mx = Math.max(mx, i);
            }
        }
        if (mx == -1) {
            System.out.println("0 0");
        } else {
            int[] subArr = Arrays.copyOfRange(arr, mn, mx + 1);
            int[] revSubArr = new int[subArr.length];
            for (int i = 0; i < subArr.length; i++) {
                revSubArr[i] = subArr[subArr.length - 1 - i];
            }
            int[] res = new int[n];
            System.arraycopy(arr, 0, res, 0, mn);
            System.arraycopy(revSubArr, 0, res, mn, subArr.length);
            System.arraycopy(arr, mx + 1, res, mn + subArr.length, n - (mx + 1));
            if (Arrays.equals(res, arr)) {
                System.out.println(mn + 1 + " " + mx + 1);
            } else {
                System.out.println("0 0");
            }
        }
    }
}
```
