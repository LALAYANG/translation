<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
Here is the Java version of your Python code:

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
        int[] list = new int[N + 1];
        int ans = 0;
        int X = 0;
        int Y = 0;
        for (int i = 0; i < N; i++) {
            if (V[i] - C[i] > 0) {
                X = V[i];
                Y = C[i];
                list[i + 1] = X - Y;
            }
        }
        for (int i = 0; i < list.length; i++) {
            ans += list[i];
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as your Python code. It reads the number of elements, then reads the values and costs, and then calculates the sum of the differences between the values and the costs if the difference is positive. <｜end▁of▁sentence｜>
