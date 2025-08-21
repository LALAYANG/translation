
```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ta = sc.nextInt() - 1;
        int ao = sc.nextInt() - 1;
        List<Integer>[] g = new List[n];
        for (int i = 0; i < n; i++) {
            g[i] = new ArrayList<>();
        }
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            g[a].add(b);
            g[b].add(a);
        }
        int[] ta_dist = new int[n];
        Arrays.fill(ta_dist, -1);
        ta_dist[ta] = 0;
        int[] ao_dist = new int[n];
        Arrays.fill(ao_dist, -1);
        ao_dist[ao] = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(ao);
        while (!q.isEmpty()) {
            int node = q.poll();
            for (int v : g[node]) {
                if (ao_dist[v] != -1) continue;
                ao_dist[v] = ao_dist[node] + 1;
                q.add(v);
            }
        }
        q.add(ta);
        while (!q.isEmpty()) {
            int node = q.poll();
            for (int v : g[node]) {
                if (ta_dist[v] != -1) continue;
                ta_dist[v] = ta_dist[node] + 1;
                q.add(v);
            }
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (ta_dist[i] > ao_dist[i]) continue;
            res = Math.max(res, ao_dist[i]);
        }
        System.out.println(res - 1);
    }
}

```

### Explanation:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```


