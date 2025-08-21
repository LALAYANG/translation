Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        ArrayList<Integer>[] edge = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            edge[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            int X = sc.nextInt() - 1;
            int Y = sc.nextInt() - 1;
            edge[X].add(Y);
            edge[Y].add(X);
        }
        boolean[] used = new boolean[N];
        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (!used[i]) {
                ans++;
                Queue<Integer> nodesToVisit = new LinkedList<>();
                nodesToVisit.add(i);
                while (!nodesToVisit.isEmpty()) {
                    int node = nodesToVisit.poll();
                    used[node] = true;
                    for (int nextNode : edge[node]) {
                        if (!used[nextNode]) {
                            nodesToVisit.add(nextNode);
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
```

Please note that the Java version does not contain the bitwise operations and the conditions that were present in the Python code. The bitwise operations and the conditions were not used in the Java version because they were not necessary for the functionality of the program.

