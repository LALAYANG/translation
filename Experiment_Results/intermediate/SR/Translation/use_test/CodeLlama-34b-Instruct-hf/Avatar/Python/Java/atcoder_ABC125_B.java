<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
4
13 21 6 19
11 30 6 15

Expected output:
6


```
N = int ( input ( ) )
V = input ( ).split ( " " )
V = [ int ( i ) for i in V ]
C = input ( ).split ( " " )
C = [ int ( i ) for i in C ]
list = [ 0 ]
ans = 0
X = 0
Y = 0
for i in range ( N ) :
    if V [ i ] - C [ i ] > 0 :
        X = V [ i ]
        Y = C [ i ]
        list.append ( X - Y )
print ( sum ( list ) )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] V = new int[N];
        int[] C = new int[N];
        int[] list = new int[N];
        int ans = 0;
        int X = 0;
        int Y = 0;

        for (int i = 0; i < N; i++) {
            V[i] = sc.nextInt();
            C[i] = sc.nextInt();
            if (V[i] - C[i] > 0) {
                X = V[i];
                Y = C[i];
                list[i] = X - Y;
                ans += list[i];
            }
        }

        System.out.println(ans);
    }
}
```
Note: The above code assumes that the input is in the format specified in the problem statement. If the input format is different, the code may need to be modified accordingly.</s>
