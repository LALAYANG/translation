<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
6 5
1 2 1
2 3 2
1 3 3
4 5 4
5 6 5

Expected output:
2


```
import sys
from collections import deque
sys.setrecursionlimit ( 10 ** 9 )
INF = 10 ** 18
def input ( ) :
    return sys.stdin.readline ( ).rstrip ( )
def main ( ) :
    N , M = map ( int , input ( ).split ( ) )
    edge = [ [ ] for _ in range ( N ) ]
    for i in range ( M ) :
        X , Y , Z = map ( lambda x : int ( x ) - 1 , input ( ).split ( ) )
        edge [ X ].append ( Y )
        edge [ Y ].append ( X )
    used = [ False ] * N
    ans = 0
    for i in range ( N ) :
        if not used [ i ] :
            ans += 1
            queue = deque ( )
            queue.append ( i )
            while queue :
                node = queue.popleft ( )
                used [ node ] = True
                for nextnode in edge [ node ] :
                    if not used [ nextnode ] :
                        queue.append ( nextnode )
    print ( ans )
if __name__ == '__main__' :
    main ( )


```
[/INST]
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Deque;
import java.util.ArrayDeque;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        List<List<Integer>> edge = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            edge.add(new ArrayList<>());
        }
        for (int i = 0; i < M; i++) {
            int X = sc.nextInt() - 1;
            int Y = sc.nextInt() - 1;
            int Z = sc.nextInt();
            edge.get(X).add(Y);
            edge.get(Y).add(X);
        }
        boolean[] used = new boolean[N];
        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (!used[i]) {
                ans++;
                Deque<Integer> queue = new ArrayDeque<>();
                queue.add(i);
                while (!queue.isEmpty()) {
                    int node = queue.removeFirst();
                    used[node] = true;
                    for (int nextNode : edge.get(node)) {
                        if (!used[nextNode]) {
                            queue.add(nextNode);
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
```
Note: The above code uses the `ArrayDeque` class from the `java.util.ArrayDeque` package, which is a resizable array implementation of the `Deque` interface. This class provides efficient insertion and removal of elements at both ends of the deque.</s>
