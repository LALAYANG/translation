<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5 5
1 2
2 3
3 4
2 5
4 5

Expected output:
-1


```
import numpy as np
from collections import deque
import heapq
N , M = map ( int , input ( ).split ( ) )
edges = [ set ( ) for _ in range ( N ) ]
degs = [ 0 for i in range ( N ) ]
parity = [ 0 for _ in range ( N ) ]
flag = [ False for _ in range ( N ) ]
for _ in range ( M ) :
    a , b = map ( int , input ( ).split ( ) )
    edges [ a - 1 ].add ( b - 1 )
    edges [ b - 1 ].add ( a - 1 )
    degs [ a - 1 ] += 1
    degs [ b - 1 ] += 1
if M % 2 != 0 :
    print ( - 1 )
    exit ( )
Q = [ ]
for i , d in enumerate ( degs ) :
    Q.append ( ( d , i ) )
heapq.heapify ( Q )
while len ( Q ) > 0 :
    _ , u = Q [ 0 ]
    heapq.heappop ( Q )
    if flag [ u ] :
        continue
    flag [ u ] = True
    for i , v in enumerate ( edges [ u ] ) :
        edges [ v ].remove ( u )
        if parity [ u ] != 0 and i == 0 :
            print ( u + 1 , v + 1 )
            parity [ u ] = 1 - parity [ u ]
        else :
            print ( v + 1 , u + 1 )
            parity [ v ] = 1 - parity [ v ]
        degs [ v ] -= 1
        heapq.heappush ( Q , ( degs [ v ] , v ) )


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        List<Set<Integer>> edges = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            edges.add(new HashSet<>());
        }
        int[] degs = new int[N];
        int[] parity = new int[N];
        boolean[] flag = new boolean[N];
        for (int i = 0; i < M; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            edges.get(a).add(b);
            edges.get(b).add(a);
            degs[a]++;
            degs[b]++;
        }
        if (M % 2 != 0) {
            System.out.println(-1);
            return;
        }
        PriorityQueue<int[]> Q = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        for (int i = 0; i < N; i++) {
            Q.add(new int[]{degs[i], i});
        }
        while (!Q.isEmpty()) {
            int[] cur = Q.poll();
            int u = cur[1];
            if (flag[u]) {
                continue;
            }
            flag[u] = true;
            for (int v : edges.get(u)) {
                edges.get(v).remove(u);
                if (parity[u] != 0) {
                    System.out.println((u + 1) + " " + (v + 1));
                    parity[u] = 1 - parity[u];
                } else {
                    System.out.println((v + 1) + " " + (u + 1));
                    parity[v] = 1 - parity[v];
                }
                degs[v]--;
                Q.add(new int[]{degs[v], v});
            }
        }
    }
}
```
<|EOT|>
