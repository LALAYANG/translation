```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] h = new int[n+1];
        for(int i=1; i<=n; i++) {
            h[i] = scanner.nextInt();
        }

        List<Integer>[] path = new ArrayList[n+1];
        for(int i=1; i<=n; i++) {
            path[i] = new ArrayList<>();
        }

        for(int i=0; i<m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            path[a].add(b);
            path[b].add(a);
        }

        int c = 0;
        for(int i=1; i<=n; i++) {
            boolean f = false;
            for(int j : path[i]) {
                if(h[i] <= h[j]) {
                    f = true;
                    break;
                }
            }
            if(!f) {
                c++;
            }
        }
        System.out.println(c);
    }
}
```

