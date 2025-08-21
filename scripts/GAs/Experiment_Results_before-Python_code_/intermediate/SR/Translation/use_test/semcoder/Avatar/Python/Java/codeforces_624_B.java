```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int pre = Integer.MAX_VALUE;
        int ans = 0;
        java.util.Arrays.sort(a);
        for (int j = n - 1; j >= 0; j--) {
            int temp = Math.min(pre - 1, a[j]);
            ans += Math.max(0, temp);
            pre = Math.max(0, temp);
        }
        System.out.println(ans);
    }
}
```
