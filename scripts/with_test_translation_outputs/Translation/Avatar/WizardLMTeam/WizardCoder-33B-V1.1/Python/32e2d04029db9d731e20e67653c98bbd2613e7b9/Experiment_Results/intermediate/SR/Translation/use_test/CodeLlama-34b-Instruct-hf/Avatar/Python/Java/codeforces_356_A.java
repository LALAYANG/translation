<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3 2
2 3 3
1 3 3

Expected output:
3 3 0 

```
n , m = map ( int , input ( ).strip ( ).split ( ) )
out = [ 0 for _ in range ( n ) ]
comp = [ i + 2 for i in range ( n ) ]
for _ in range ( m ) :
    l , r , x = map ( int , input ( ).strip ( ).split ( ) )
    t = l
    while t <= r :
        next_val = comp [ t - 1 ]
        if out [ t - 1 ] == 0 and t != x :
            out [ t - 1 ] = x
        comp [ t - 1 ] = r + 1 if t >= x else x
        t = next_val
print ( * out )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] out = new int[n];
        int[] comp = new int[n];

        for (int i = 0; i < m; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int x = sc.nextInt();
            int t = l;
            while (t <= r) {
                int nextVal = comp[t - 1];
                if (out[t - 1] == 0 && t != x) {
                    out[t - 1] = x;
                }
                comp[t - 1] = r + 1;
                if (t >= x) {
                    comp[t - 1] = x;
                }
                t = nextVal;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(out[i] + " ");
        }
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not the most efficient or elegant solution, and there may be better ways to solve the problem in Java.</s>
