<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5 4 5
1 2
1 3
1 4
1 5

Expected output:
1


```
from collections import Counter , defaultdict , deque
from heapq import heappop , heappush , heapify
import sys , bisect , math , itertools , pprint , fractions
sys.setrecursionlimit ( 10 ** 8 )
mod = 10 ** 9 + 7
INF = float ( 'inf' )
def inp ( ) : return int ( sys.stdin.readline ( ) )
def inpl ( ) : return list ( map ( int , sys.stdin.readline ( ).split ( ) ) )
n , ta , ao = inpl ( )
ta -= 1 ; ao -= 1
g = [ [ ] for i in range ( n ) ]
for i in range ( n - 1 ) :
    a , b = inpl ( )
    g [ a - 1 ].append ( b - 1 )
    g [ b - 1 ].append ( a - 1 )
ta_dist = [ None ] * n
ta_dist [ ta ] = 0
ao_dist = [ None ] * n
ao_dist [ ao ] = 0
def ta_dfs ( node ) :
    for v in g [ node ] :
        if ta_dist [ v ] != None : continue
        ta_dist [ v ] = ta_dist [ node ] + 1
        ta_dfs ( v )
def ao_dfs ( node ) :
    for v in g [ node ] :
        if ao_dist [ v ] != None : continue
        ao_dist [ v ] = ao_dist [ node ] + 1
        ao_dfs ( v )
ao_dfs ( ao )
ta_dfs ( ta )
res = 0
for i in range ( n ) :
    if ta_dist [ i ] > ao_dist [ i ] : continue
    res = max ( res , ao_dist [ i ] )
print ( res - 1 )


```

### Response:
```java
import java.util.*;

public class Main {
    static int n, ta, ao;
    static ArrayList<Integer>[] g;
    static int[] ta_dist, ao_dist;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ta = sc.nextInt() - 1;
        ao = sc.nextInt() - 1;
        g = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            g[i] = new ArrayList<>();
        }
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            g[a].add(b);
            g[b].add(a);
        }
        ta_dist = new int[n];
        ao_dist = new int[n];
        Arrays.fill(ta_dist, -1);
        Arrays.fill(ao_dist, -1);
        ta_dist[ta] = 0;
        ao_dist[ao] = 0;
        dfs(ta, ta_dist, g);
        dfs(ao, ao_dist, g);
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (ta_dist[i] > ao_dist[i]) continue;
            res = Math.max(res, ao_dist[i]);
        }
        System.out.println(res - 1);
    }

    static void dfs(int node, int[] dist, ArrayList<Integer>[] g) {
        for (int v : g[node]) {
            if (dist[v] != -1) continue;
            dist[v] = dist[node] + 1;
            dfs(v, dist, g);
        }
    }
}
```
<|EOT|>
