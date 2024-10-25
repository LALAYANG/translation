<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ta = sc.nextInt();
        int ao = sc.nextInt();
        ta -= 1;
        ao -= 1;
        List<List<Integer>> g = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            g.add(new ArrayList<>());
        }
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            g.get(a - 1).add(b - 1);
            g.get(b - 1).add(a - 1);
        }
        int[] ta_dist = new int[n];
        int[] ao_dist = new int[n];
        ta_dist[ta] = 0;
        ao_dist[ao] = 0;
        dfs(g, ta, ta_dist);
        dfs(g, ao, ao_dist);
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (ta_dist[i] > ao_dist[i]) {
                continue;
            }
            res = Math.max(res, ao_dist[i]);
        }
        System.out.println(res - 1);
    }

    public static void dfs(List<List<Integer>> g, int node, int[] dist) {
        for (int v : g.get(node)) {
            if (dist[v] != -1) {
                continue;
            }
            dist[v] = dist[node] + 1;
            dfs(g, v, dist);
        }
    }
}
```
Note: The above code uses the `Scanner` class to read input from the user. If you want to use the `inp()` and `inpl()` functions from the original Python code, you can replace the `Scanner` class with the following code:
```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int n = inp();
        int ta = inp();
        int ao = inp();
        ta -= 1;
        ao -= 1;
        List<List<Integer>> g = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            g.add(new ArrayList<>());
        }
        for (int i = 0; i < n - 1; i++) {
            int a = inp();
            int b = inp();
            g.get(a - 1).add(b - 1);
            g.get(b - 1).add(a - 1);
        }
        int[] ta_dist = new int[n];
        int[] ao_dist = new int[n];
        ta_dist[ta] = 0;
        ao_dist[ao] = 0;
        dfs(g, ta, ta_dist);
        dfs(g, ao, ao_dist);
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (ta_dist[i] > ao_dist[i]) {
                continue;
            }
            res = Math.max(res, ao_dist[i]);
        }
        System.out.println(res - 1);
    }

    public static void dfs(List<List<Integer>> g, int node, int[] dist) {
        for (int v : g.get(node)) {
            if (dist[v] != -1) {
                continue;
            }
            dist[v] = dist[node] + 1;
            dfs(g, v, dist);
        }
    }

    public static int inp() {
        return Integer.parseInt(System.console().readLine());
    }

    public static List<Integer> inpl() {
        String[] tokens = System.console().readLine().split(" ");
        List<Integer> list = new ArrayList<>();
        for (String token : tokens) {
            list.add(Integer.parseInt(token));
        }
        return list;
    }
}
```</s>
