```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] edge = new int[N][N];
        for (int i = 0; i < M; i++) {
            int X = sc.nextInt() - 1;
            int Y = sc.nextInt() - 1;
            int Z = sc.nextInt();
            edge[X][Y] = Z;
            edge[Y][X] = Z;
        }
        boolean[] used = new boolean[N];
        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (!used[i]) {
                ans++;
                Queue<Integer> q = new LinkedList<>();
                q.offer(i);
                used[i] = true;
                while (!q.isEmpty()) {
                    int node = q.poll();
                    for (int nextnode = 0; nextnode < N; nextnode++) {
                        if (edge[node][nextnode] != 0 && !used[nextnode]) {
                            q.offer(nextnode);
                            used[nextnode] = true;
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
```
