Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] t = new int[n + 1];
        int[] a = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            t[i] = scanner.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            a[i] = scanner.nextInt();
        }
        List<Integer> ans = new ArrayList<>();
        int[] cnt = new int[n + 1];
        for (int i : a) {
            cnt[i]++;
        }
        for (int i = 1; i <= n; i++) {
            if (t[i] == 1) {
                List<Integer> crt = new ArrayList<>();
                int x = a[i];
                while (cnt[x] == 1) {
                    crt.add(x);
                    x = a[x];
                }
                if (crt.size() > ans.size()) {
                    ans = new ArrayList<>(crt);
                }
            }
        }
        Collections.reverse(ans);
        System.out.println(ans.size());
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads the input, counts the occurrences of each number in the array `a`, and then finds the longest sequence of numbers in `a` that is also in `t`. The result is printed to the console.

