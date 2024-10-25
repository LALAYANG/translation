<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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

### Response:
```java
import java.util.*;

public class Main {
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int N = sc.nextInt();
        int M = sc.nextInt();
        ArrayList<Integer>[] edge = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            edge[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            int X = sc.nextInt() - 1;
            int Y = sc.nextInt() - 1;
            int Z = sc.nextInt();
            edge[X].add(Y);
            edge[Y].add(X);
        }
        boolean[] used = new boolean[N];
        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (!used[i]) {
                ans++;
                Queue<Integer> queue = new LinkedList<>();
                queue.add(i);
                while (!queue.isEmpty()) {
                    int node = queue.poll();
                    used[node] = true;
                    for (int nextnode : edge[node]) {
                        if (!used[nextnode]) {
                            queue.add(nextnode);
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
``` <｜end▁of▁sentence｜>
