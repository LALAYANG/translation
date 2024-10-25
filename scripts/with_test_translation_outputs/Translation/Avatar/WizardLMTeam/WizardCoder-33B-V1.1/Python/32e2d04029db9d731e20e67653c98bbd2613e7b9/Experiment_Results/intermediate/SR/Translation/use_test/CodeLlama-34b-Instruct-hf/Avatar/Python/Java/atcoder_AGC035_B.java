<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class JavaProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] edges = new int[N][N];
        int[] degs = new int[N];
        int[] parity = new int[N];
        boolean[] flag = new boolean[N];

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            edges[a - 1][b - 1] = 1;
            edges[b - 1][a - 1] = 1;
            degs[a - 1]++;
            degs[b - 1]++;
        }

        if (M % 2 != 0) {
            System.out.println(-1);
            return;
        }

        Queue<Integer> Q = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            Q.add(i);
        }

        while (!Q.isEmpty()) {
            int u = Q.poll();
            if (flag[u]) {
                continue;
            }
            flag[u] = true;
            for (int v : edges[u]) {
                if (parity[u] != 0 && v == 0) {
                    System.out.println(u + 1 + " " + v + 1);
                    parity[u] = 1 - parity[u];
                } else {
                    System.out.println(v + 1 + " " + u + 1);
                    parity[v] = 1 - parity[v];
                }
                degs[v]--;
                Q.add(v);
            }
        }
    }
}
```
Note: The above code is a Java implementation of the Python code you provided. It uses a similar approach to the Python code, but with some differences due to the differences in the languages. The code is not optimized for performance, but it should work correctly for the given input.</s>
