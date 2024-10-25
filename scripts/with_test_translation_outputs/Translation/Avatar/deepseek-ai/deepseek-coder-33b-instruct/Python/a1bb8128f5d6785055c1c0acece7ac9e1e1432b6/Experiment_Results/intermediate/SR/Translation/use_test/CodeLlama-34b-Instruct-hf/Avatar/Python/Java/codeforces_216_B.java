<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3 3
1 2
1 3
2 3

Expected output:
1

```
def readInts ( ) : return map ( int , input ( ).split ( ) )
def dfs ( g , seen , i ) :
    if i in seen :
        return 0 , 0
    seen.add ( i )
    nodes = 1
    edges = len ( g [ i ] )
    for j in g [ i ] :
        x , y = dfs ( g , seen , j )
        nodes += x
        edges += y
    return nodes , edges
def solve ( ) :
    line0 = [ ]
    try : line0 = readInts ( )
    except EOFError : return False
    n , m = line0
    g = { }
    seen = set ( )
    for i in range ( 1 , n + 1 ) :
        g [ i ] = set ( )
    for _ in range ( m ) :
        a , b = readInts ( )
        g [ a ].add ( b )
        g [ b ].add ( a )
    ans = 0
    for i in range ( 1 , n + 1 ) :
        if i not in seen :
            nodes , edges = dfs ( g , seen , i )
            if nodes > 1 and nodes % 2 == 1 and 2 * nodes == edges :
                ans += 1
    if ( n - ans ) % 2 == 1 :
        ans += 1
    print ( ans )
    return True
while solve ( ) : pass


```
[/INST]
```java
import java.util.Scanner;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            graph.put(i, new HashSet<>());
        }
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (!graph.containsKey(i)) {
                continue;
            }
            Set<Integer> seen = new HashSet<>();
            int nodes = 1;
            int edges = graph.get(i).size();
            for (int j : graph.get(i)) {
                if (!seen.contains(j)) {
                    seen.add(j);
                    nodes++;
                    edges += graph.get(j).size();
                }
            }
            if (nodes > 1 && nodes % 2 == 1 && 2 * nodes == edges) {
                ans++;
            }
        }
        if ((n - ans) % 2 == 1) {
            ans++;
        }
        System.out.println(ans);
    }
}
```
Note: The above code is a Java implementation of the given Python code. It uses a similar approach to the Python code, but with some differences in syntax and data structures. The code is written in a way that it can be easily compiled and run in a Java environment.</s>
