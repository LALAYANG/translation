<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
26
243 364 768 766 633 535 502 424 502 283 592 877 137 891 837 990 681 898 831 487 595 604 747 856 805 688

Expected output:
16535


```
import sys
input = sys.stdin.readline
n = int ( input ( ) )
a = list ( map ( int , input ( ).split ( ) ) )
pre = float ( 'inf' )
ans = 0
a.sort ( reverse = True )
for j in range ( n ) :
    ans += max ( 0 , min ( pre - 1 , a [ j ] ) )
    pre = max ( 0 , min ( pre - 1 , a [ j ] ) )
print ( ans )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int pre = Integer.MAX_VALUE;
        int ans = 0;
        for (int j = 0; j < n; j++) {
            int current = Math.max(0, Math.min(pre - 1, a[j]));
            ans += current;
            pre = Math.max(0, Math.min(pre - 1, a[j]));
        }
        System.out.println(ans);
    }
}
```
Note: In Java, we use `Integer.MAX_VALUE` instead of `float('inf')` to represent infinity.</s>
