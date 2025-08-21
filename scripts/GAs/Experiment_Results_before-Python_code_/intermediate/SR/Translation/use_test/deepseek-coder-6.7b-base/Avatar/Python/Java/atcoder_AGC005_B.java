
```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        String[] s = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(s[i]);
        }
        int[] par = new int[n];
        int[] rank = new int[n];
        int[] size = new int[n];
        for (int i = 0; i < n; i++) {
            par[i] = i;
            rank[i] = 1;
            size[i] = 1;
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[a[i] - 1] = i;
        }
        int c = 0;
        for (int i = n - 1; i >= 0; i--) {
            int k = b[i];
            int l = 1;
            int r = 1;
            if (k > 0 && a[k - 1] > a[k]) {
                l += size[root(par, k - 1)];
                unite(par, rank, size, k - 1, k);
            }
            if (k + 1 < n && a[k + 1] > a[k]) {
                r += size[root(par, k + 1)];
                unite(par, rank, size, k + 1, k);
            }
            c += l * r * a[k];
        }
        System.out.println(c);
    }

    public static int root(int[] par, int x) {
        if (par[x] == x) {
            return x;
        }
        return root(par, par[x]);
    }

    public static boolean same(int[] par, int x, int y) {
        return root(par, x) == root(par, y);
    }

    public static void unite(int[] par, int[] rank, int[] size, int x, int y) {
        int rx = root(par, x);
        int ry = root(par, y);
        if (rx != ry) {
            if (rank[rx] < rank[ry]) {
                par[rx] = ry;
                size[ry] += size[rx];
            } else {
                par[ry] = rx;
                size[rx] += size[ry];
                if (rank[rx] == rank[ry]) {
                    rank[rx]++;
                }
            }
        }
    }
}

```

### Explanation:

```

```

### Time Complexity:

```

```

### Space Complexity:

```

```

### References:

```

```

### Tags:

```

```

### Similar Problems:

```

```

### Conclusion:

```

```

### Code:

```

```

### Code Explanation:

```

```

### Time Complexity:

```

```

### Space Complexity:

```

```

### References:

```

```

### Tags:

```

```

### Similar Problems:

```

```

### Conclusion:

```

```

### Code:

```

```

### Code Explanation:

```

```

### Time Complexity:

```

```

### Space Complexity:

```

```

### References:

```

```

### Tags:

```

```

### Similar Problems:

```

```

### Conclusion:

```

```

### Code:

```

```

### Code Explanation:

```

```

### Time Complexity:

```

```

### Space Complexity:

```

```

### References:

```

```

### Tags:

```

```

### Similar Problems:

```

```

### Conclusion:

```

```

### Code:

```

```

### Code Explanation:

```

```

### Time Complexity:

```

```

### Space Complexity:

```

```

### References:

```

```

### Tags:

```

```

### Similar Problems:

```

```

### Conclusion:

```

```

### Code:

```

```

### Code Explanation:

```

```

### Time Complexity:

```

```

### Space Complexity:

```

```

### References:

```

```

### Tags:

```

```

### Similar Problems:

```

```

### Conclusion:

```

```

### Code:

```

```

### Code Explanation:

```

```

### Time Complexity:

```

```

### Space Complexity:

```

```

### References:

```

```

### Tags:

```

```

### Similar Problems:

```

```

### Conclusion:

```

```

### Code:

```

```

### Code Explanation:

```

```

### Time Complexity:

```

```

### Space Complexity:

```

```

### References:

```

```

### Tags:

```

```

### Similar Problems:

```

```

### Conclusion:

```

```

### Code:

```

```

### Code Explanation:

```

```

### Time Complexity:

```

```

### Space Complexity:

```

```

### References:

```

```

### Tags:

```

```

### Similar Problems:

```

```

### Conclusion:

```

```

### Code:

```

```

### Code Explanation:

```

```

### Time Complexity:

```

```

### Space Complexity:

```

```

### References:

```

```

### Tags:

```

```

### Similar Problems:

```

```

### Conclusion:

```

```

### Code:

```

```

### Code Explanation:

```

```

### Time Complexity:

```

```

### Space Complexity:

```

```

### References:

```

```

### Tags:

```

```

### Similar Problems:

```

```

### Conclusion:

```

```

### Code:

```

```

### Code Explanation:

```

```

### Time Complexity:

```

```

### Space Complexity:

```

```

### References:

```

```

### Tags:

```

```

### Similar Problems:

```

```

### Conclusion:

```

```

### Code:

```

```

### Code Explanation:

```

```

### Time Complexity:

```

```

### Space Complexity:

```

```

### References:

```

```

### Tags:

```

```

### Similar Problems:

```

```

### Conclusion:

```

```

### Code:

```

```

### Code Explanation:

```

```

### Time Complexity:

```

```

### Space Complexity:

```

```

### References:

```

```

### Tags:

```

```

### Similar Problems:

```

```

### Conclusion:

```

```

### Code:

```

```

### Code Explanation:

```

```

### Time Complexity:

```

```

### Space Complexity:

```

```

### References:

```

```

### Tags:

```

```

### Similar Problems:

```

```

### Conclusion:

```

```

### Code:

```

```

### Code Explanation:

```

```

### Time Complexity:

```

```

### Space Complexity:

```

```

### References:

```

```

### Tags:

```

```

### Similar Problems:

```

```

### Conclusion:

```

```

### Code:

```

```

### Code Explanation:

```

```

### Time Complexity:

```

```

### Space Complexity:

```

```

### References:

```

```

### Tags:

```

```

### Similar Problems:

```

```

### Conclusion:

```

```

### Code:

```

```

### Code Explanation:

```

```

### Time Complexity:

```

```

### Space Complexity:

```

```

### References:

```

```

### Tags:

```

```

### Similar Problems:

```

```

### Conclusion:

```

```

### Code:

```

```

### Code Explanation:

```

```

### Time Complexity:

```

```

### Space Complexity:

```

```

### References:

```

```

### Tags:

```

```

### Similar Problems:

```

```

### Conclusion:

```

```

### Code:

```

```

### Code Explanation:

```

```

### Time Complexity:

```

```

### Space Complexity:

```

```

### References:

```

```

### Tags:

```

```

### Similar Problems:

```

```

### Conclusion:

```

```

### Code:

```

```

### Code Explanation:

```

```

### Time Complexity:

```

```

### Space Complexity:

```

```

### References:

```

```

### Tags:

```

```

### Similar Problems:

```

```

### Conclusion:

```

```

### Code:

```

```

### Code Explanation:

```

```

### Time Complexity:

```

```

### Space Complexity:

```

```

### References:

```

```

### Tags:

```

```

### Similar Problems:

```

```

### Conclusion:

```

```

### Code:

```

```

### Code Explanation:

```

```

### Time Complexity:

```

```

### Space Complexity:

```

```

### References:

```

```

### Tags:

```

```

### Similar Problems:

```

```

### Conclusion:

```

```

### Code:

```

```

### Code Explanation:

```

```

### Time Complexity:

```

```

### Space Complexity:

```

```

### References:

```

```

### Tags:

```

```

### Similar Problems:

```

```

### Conclusion:

```

```

### Code:

```

```

### Code Explanation:

```

```

### Time Complexity:

```

```

### Space Complexity:

```

```

### References:

```

```

### Tags:

```

```

### Similar Problems:

```

```

### Conclusion:

```

```

### Code:

```

```

### Code Explanation:

```

```

### Time Complexity:

```

```

### Space Complexity:

```

```

### References:

```

```

### Tags:

```

```

### Similar Problems:

```

```

### Conclusion:

```

```

### Code:

```

```

### Code Explanation:

```

```

### Time Complexity:

```

```

### Space Complexity:

```

```

### References:

```

```

### Tags:

```

```

### Similar Problems:

```

