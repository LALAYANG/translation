<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1
0

Expected output:
0

```
n = int ( input ( ) )
r = [ * map ( int , input ( ).split ( ) ) ]
ans = abs ( r [ 0 ] )
for i in range ( 1 , n ) :
    ans += abs ( r [ i ] - r [ i - 1 ] )
print ( ans )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] r = new int[n];
        for (int i = 0; i < n; i++) {
            r[i] = sc.nextInt();
        }
        int ans = Math.abs(r[0]);
        for (int i = 1; i < n; i++) {
            ans += Math.abs(r[i] - r[i - 1]);
        }
        System.out.println(ans);
    }
}
```

Note: The `Math.abs()` method is used to get the absolute value of a number.</s>
