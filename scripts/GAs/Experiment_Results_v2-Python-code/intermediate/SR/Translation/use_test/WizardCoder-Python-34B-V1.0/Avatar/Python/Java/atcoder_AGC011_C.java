```java
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] vis = new int[n + 1];
        int ci = 0;
        int cb = 0;
        int cc = 0;
        boolean[][] adjMatrix = new boolean[n + 1][n + 1];
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < m; i++) {
            int u = scanner.nextInt();
            int neighbor = scanner.nextInt();
            adjMatrix[u][neighbor] = true;
            adjMatrix[neighbor][u] = true;
        }

        for (int i = 1; i <= n; i++) {
            if (vis[i] == 0) {
                queue.add(i);
                vis[i] = 1;
                while (!queue.isEmpty()) {
                    int u = queue.poll();
                    for (int j = 1; j <= n; j++) {
                        if (adjMatrix[u][j]) {
                            if (vis[j] == 0) {
                                vis[j] = 3 - vis[u];
                                queue.add(j);
                            } else if (vis[j] == vis[u]) {
                                System.out.println("Graph is not bipartite");
                                return;
                            }
                        }
                    }
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            if (vis[i] == 0) {
                ci++;
            } else if (vis[i] == 1) {
                cb++;
            } else {
                cc++;
            }
        }

        System.out.println(ci * ci + 2 * ci * (n - ci) + cc * cc + 2 * cb * cc + 2 * cb * cb);
    }
}
```

Test input:
100000 59037
55663 96110
12302 40318
39426 61477
3948 91961
18024 44072
39717 70234
22833 25289
58772 83334
53855 78428
1644 37577
17928 87375
52006 55764
1893 71543
56568 61711
28494 40578
7283 15106
62129 87815
59049 86168
59908 86095
12056 32063
60702 99400
9074 94822
23465 59014
36971 44068
4342 43545
6598 34960
16775 44784
31735 41331
19681 70697
8498 83497
44260 82320
61913 64455
86066 96154
66005 72160
50825 99297
70660 95156
47405 78409
15674 97427
9229 63161
24841 94052
18274 84709
428
Expected output:
8938511365
``` 
