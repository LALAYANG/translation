
```
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println(0);
            return;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                map.put(i, map.getOrDefault(i, 0) + 1);
                n /= i;
            }
        }
        if (n != 1) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        int ans = 0;
        for (Entry<Integer, Integer> entry : map.entrySet()) {
            int p = entry.getKey();
            int e = entry.getValue();
            int x = e;
            for (int i = 1; i <= 99999999; i++) {
                if (x >= i) {
                    x -= i;
                    ans++;
                } else {
                    break;
                }
            }
        }
        System.out.println(ans);
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

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

```

```

### Code:

