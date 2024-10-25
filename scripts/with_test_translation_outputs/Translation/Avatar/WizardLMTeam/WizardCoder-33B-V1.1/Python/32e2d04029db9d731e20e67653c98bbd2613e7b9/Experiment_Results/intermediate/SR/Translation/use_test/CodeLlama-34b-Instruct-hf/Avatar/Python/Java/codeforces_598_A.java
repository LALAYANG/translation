<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
10
1
2
3
4
5
6
7
8
9
10

Expected output:
-1
-3
0
-4
1
7
14
6
15
25


```
t = int ( input ( ) )
def solve ( n ) :
    s = ( 1 + n ) * n // 2
    t = 1
    while t <= n :
        s -= 2 * t
        t *= 2
    return s
for _ in range ( t ) :
    n = int ( input ( ) )
    print ( solve ( n ) )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.println(solve(n));
        }
    }

    public static int solve(int n) {
        int s = (1 + n) * n / 2;
        int t = 1;
        while (t <= n) {
            s -= 2 * t;
            t *= 2;
        }
        return s;
    }
}
```
Note: The above code is written in Java 8. If you are using an older version of Java, you may need to make some adjustments to the code.</s>
