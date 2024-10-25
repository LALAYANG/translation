<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3 3
10 9 12

Expected output:
2


```
n , d = map ( int , input ( ).split ( ) )
x = [ ]
m = 0
q = 0
x = input ( ).split ( )
for i in range ( len ( x ) ) :
    x [ i ] = int ( x [ i ] )
for a in range ( len ( x ) - 1 ) :
    if x [ a ] >= x [ a + 1 ] :
        q = int ( ( x [ a ] - x [ a + 1 ] ) / d + 1 )
        m = m + q
        x [ a + 1 ] = x [ a + 1 ] + q * d
print ( m )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        int m = 0;
        for (int a = 0; a < n - 1; a++) {
            if (x[a] >= x[a + 1]) {
                int q = (x[a] - x[a + 1]) / d + 1;
                m += q;
                x[a + 1] += q * d;
            }
        }
        System.out.println(m);
    }
}
```
Test case:

Input:
3 3
10 9 12

Output:
2</s>
