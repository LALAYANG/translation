Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    static int n, m;
    static int[] a;
    static HashMap<Integer, Integer> d = new HashMap<>();
    static int[] bit;

    static int bitSum(int i) {
        int sum = 0;
        while (i > 0) {
            sum += bit[i];
            i -= i & -i;
        }
        return sum;
    }

    static void bitAdd(int i, int x) {
        while (i <= n) {
            bit[i] += x;
            i += i & -i;
        }
    }

    static boolean check(int x) {
        int[] b = new int[n + 1];
        for (int i = 0; i < n; i++) {
            b[i + 1] = b[i] + ((a[i] >= x) ? 2 : -1);
        }
        int min = b[0];
        for (int i = 1; i <= n; i++) {
            b[i] -= min;
        }
        bit = new int[Collections.max(Arrays.asList(b)) + 2];
        int ans = 0;
        for (int i = 0; i <= n; i++) {
            ans += bitSum(b[i] + 1);
            bitAdd(b[i], 1);
        }
        return ans >= m;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = n * (n + 1) / 4;
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        List<Integer> _a = new ArrayList<>(new HashSet<>(Arrays.asList(a)));
        Collections.sort(_a);
        for (int i = 0; i < _a.size(); i++) {
            d.put(_a.get(i), i);
        }
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = d.get(a[i]);
        }
        int l = 0, r = _a.size();
        while (r - l > 1) {
            int mid = (l + r) / 2;
            if (check(mid)) {
                l = mid;
            } else {
                r = mid;
            }
        }
        System.out.println(_a.get(r - 1));
    }
}
```

This Java code does the same thing as the Python code. It first reads the input, converts the array to a binary indexed tree, and checks if the condition is satisfied. If it is, it updates the right boundary of the search range; otherwise, it updates the left boundary. The loop continues until the search range is only one element long, and then it prints the answer.

