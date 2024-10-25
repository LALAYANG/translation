<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] V = new int[N];
        int[] C = new int[N];
        for (int i = 0; i < N; i++) {
            V[i] = scanner.nextInt();
        }
        for (int i = 0; i < N; i++) {
            C[i] = scanner.nextInt();
        }
        int ans = 0;
        int X = 0;
        int Y = 0;
        for (int i = 0; i < N; i++) {
            if (V[i] - C[i] > 0) {
                X = V[i];
                Y = C[i];
                ans += X - Y;
            }
        }
        System.out.println(ans);
    }
}
```
<|EOT|>
