<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
100 100
100 10

Expected output:
34500

```
v1 , v2 = input ( ).split ( )
t , d = input ( ).split ( )
v1 = int ( v1 )
v2 = int ( v2 )
t = int ( t )
d = int ( d )
a = 1
v = v1
distance = 0
for i in range ( t ) :
    if v - v2 > ( t - i - 1 ) * d :
        a *= - 1
        v = ( t - i - 1 ) * d + v2
    distance += v
    v += a * d
print ( distance )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
        int t = sc.nextInt();
        int d = sc.nextInt();
        int a = 1;
        int v = v1;
        int distance = 0;
        for (int i = 0; i < t; i++) {
            if (v - v2 > (t - i - 1) * d) {
                a *= -1;
                v = (t - i - 1) * d + v2;
            }
            distance += v;
            v += a * d;
        }
        System.out.println(distance);
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not the most efficient or elegant solution, and there may be better ways to solve the problem in Java.</s>
