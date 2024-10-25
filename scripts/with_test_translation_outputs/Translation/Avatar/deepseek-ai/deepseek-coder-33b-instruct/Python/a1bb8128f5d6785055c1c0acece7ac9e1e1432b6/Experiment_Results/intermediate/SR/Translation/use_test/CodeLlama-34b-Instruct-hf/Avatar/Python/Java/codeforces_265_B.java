<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
2
1
2
1
1

Expected output:
14


```
n = int ( input ( ) )
l = [ ]
for i in range ( n ) :
    l.append ( int ( input ( ) ) )
ans = n - 1
last = 0
for i in l :
    ans += abs ( last - i ) + 1
    last = i
print ( ans )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        int ans = n - 1;
        int last = 0;
        for (int i = 0; i < n; i++) {
            ans += Math.abs(last - l[i]) + 1;
            last = l[i];
        }
        System.out.println(ans);
    }
}
```
Test input:
5
2
1
2
1
1

Expected output:
14

Note: In Java, we use the `Math.abs()` method to get the absolute value of a number, instead of the `abs()` function used in Python.</s>
