<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
2 10
9 3
1 4

Expected output:
12


```
import sys
input = sys.stdin.readline
n , s = map ( int , input ( ).split ( ) )
c = 0
for _ in range ( n ) :
    f , t = map ( int , input ( ).split ( ) )
    x = t - ( s - f )
    if x > c :
        c = x
print ( s + c )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int c = 0;
        for (int i = 0; i < n; i++) {
            int f = sc.nextInt();
            int t = sc.nextInt();
            int x = t - (s - f);
            if (x > c) {
                c = x;
            }
        }
        System.out.println(s + c);
    }
}
```
Note: In Java, we use the `Scanner` class to read input from the user. The `nextInt()` method is used to read the next integer from the input stream.</s>
