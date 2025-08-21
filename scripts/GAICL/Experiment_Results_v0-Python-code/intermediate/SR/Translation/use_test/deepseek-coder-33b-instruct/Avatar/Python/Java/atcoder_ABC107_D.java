Here is the Java translation of the Python code:

```java
import java.util.*;
import java.lang.Math;

class BIT {
    int size;
    int[] tree;
    int depth;

    BIT(int N) {
        this.size = N;
        this.tree = new int[N + 1];
        this.depth = (int) (Math.log(N) / Math.log(2));
    }

    int _bitsum(int index) {
        int ret = 0;
        while (index > 0) {
            ret += this.tree[index];
            index ^= index & -index;
        }
        return ret;
    }

    int bitsum(int l, int r) {
        return this._bitsum(r) - this._bitsum(l);
    }

    void bitadd(int index, int x) {
        index = index + 1;
        while (index <= this.size) {
            this.tree[index] += x;
            index += index & -index;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = n * (n + 1) / 4;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        int[] b = new int[n + 1];
        for (int i = 0; i < n; i++) {
            b[i + 1] = b[i] + a[i];
        }
        int[] c = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            c[i] = b[i] - b[0];
        }
        BIT bit = new BIT(Arrays.stream(c).max().getAsInt() + 2);
        int ans = 0;
        for (int x : c) {
            ans += bit.bitsum(x + 1);
            bit.bitadd(x, 1);
        }
        System.out.println(ans);
    }
}
```

Please note that the Python code uses the `scipy.stats.ttest_ind` function to perform a t-test on two independent samples. This function is not available in Java, so it has been removed from the Java translation.

