<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1
F 68 307

Expected output:
0


```
import sys
input = sys.stdin.readline
N = 368
m = [ 0 ] * N
f = [ 0 ] * N
for i in range ( int ( input ( ) ) ) :
    x , a , b = input ( ) [ : - 1 ].split ( )
    a = int ( a )
    b = int ( b ) + 1
    if x == 'M' :
        m [ a ] += 2
        m [ b ] -= 2
    else :
        f [ a ] += 2
        f [ b ] -= 2
a , b , c = 0 , 0 , 0
for i in range ( N ) :
    a += m [ i ]
    b += f [ i ]
    if min ( a , b ) > c :
        c = min ( a , b )
print ( c )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 368;
        int[] m = new int[N];
        int[] f = new int[N];

        int numCases = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numCases; i++) {
            String[] input = scanner.nextLine().split(" ");
            String x = input[0];
            int a = Integer.parseInt(input[1]);
            int b = Integer.parseInt(input[2]) + 1;

            if (x.equals("M")) {
                m[a] += 2;
                m[b] -= 2;
            } else {
                f[a] += 2;
                f[b] -= 2;
            }
        }

        int a = 0, b = 0, c = 0;
        for (int i = 0; i < N; i++) {
            a += m[i];
            b += f[i];
            if (Math.min(a, b) > c) {
                c = Math.min(a, b);
            }
        }

        System.out.println(c);
    }
}
```
Note: In the Java code, I have used `Math.min()` to find the minimum of `a` and `b`. In Python, you can use the `min()` function to do the same.</s>
