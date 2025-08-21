```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<List<Integer>> G = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            G.add(new ArrayList<>());
        }
        Map<Integer, Integer> E = new HashMap<>();
        for (int i = 0; i < N - 1; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            G.get(a).add(b);
            G.get(b).add(a);
            E.put(Math.min(a, b) * N + Math.max(a, b), 0);
        }
        int K = Func_bfs_0(0, N, G, E);
        System.out.println(K);
        for (int value : E.values()) {
            System.out.println(value);
        }
    }

    public static int Func_bfs_0(int v, int N, List<List<Integer>> G, Map<Integer, Integer> E) {
        boolean[] visited = new boolean[N];
        Queue<Integer> queue = new LinkedList<>();
        int K = -1;
        int[] node2color = new int[N];
        Arrays.fill(node2color, -1);
        queue.add(v);
        visited[v] = true;
        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            int color = 0;
            int alwaysTrue = 1;
            for (int nex : G.get(currentNode)) {
                if (visited[nex]) {
                    continue;
                }
                visited[nex] = true;
                color++;
                if (color == node2color[currentNode]) {
                    color++;
                }
                node2color[nex] = color;
                E.put(Math.min(currentNode, nex) * N + Math.max(currentNode, nex), color);
                queue.add(nex);
            }
            K = Math.max(K, color);
        }
        return K;
    }
}
```

Test input:
534
243 524
152 315
153 156
317 390
110 173
23 45
184 325
21 76
256 412
432 465
31 80
129 531
62 77
22 146
65 414
135 163
167 494
157 353
229 300
134 141
342 517
383 466
261 516
39 144
195 307
167 201
432 513
128 461
364 481
179 448
172 486
12 46
60 282
312 383
9 427
73 106
18 50
6 176
42 142
104 420
104 298
201 295
37 174
206 407
188 306
460 530
224 272
55 196
16 281
1 7
265 395
11 13
225 242
3 6
379 504
53 93
110 305
1 10
76 491
11 203
395 436
273 318
72 190
108 129
217 313
417 460
78 187
19 3
```

Expected output:
11
1
1
1
2
2
1
1
1
2
2
1
2
1
1
1
2
1
1
1
2
1
1
2
3
3
1
2
1
1
2
1
6
1
4
2
1
1
2
1
8
1
1
4
2
1
3
2
1
2
1
2
5
2
1
2
1
2
1
1
1
1
1
1
1
2
1
1
2
1
1
1
1
1
1
1
1
2
1
1
2
1
1
1
1
2
1
1
1
2
1
1
1
1
1
3
1
4
2
1
1
2
1
1
4
2
1
2
7
3
3
2
3
1
2
1
3
2
3
1
1
3
3
2
2
1
2
1
2
2
2
2
2
3
4
3
1
3
1
1
2
1
3
1
1
1
3
4
1
2
3
1
1
1
2
2
5
2
1
2
1
1
8
1
1
4
2
1
3
2
2
1
2
5
1
1
1
1
1
1
1
1
1
2
2
5
2
1
2
1
2
1
6
1
1
2
3
2
2
1
2
1
3
1
1
1
2
2
2
2
1
3
2
1
3
1
2
2
4
1
3
3
1
3
3
1
3
2
2
1
2
1
4
3
1
6
``` 
