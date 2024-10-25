<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
10 1
9 8 7 6 5 4 3 2 1 0

Expected output:
10 9 8 7 6 5 4 3 2 1 

```
u = input
n , k = map ( int , u ( ).split ( ) )
M = [ int ( i ) for i in u ( ).split ( ) ]
m = 0
for j in range ( n ) :
    for p in range ( n ) :
        if ( 0 == M [ p ] ) :
            print ( p + 1 , end = ' ' )
            break
    for l in range ( p + 1 - k ) : M [ l ] -= 1
    M [ p ] -= 1


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] M = new int[n];
        for (int i = 0; i < n; i++) {
            M[i] = scanner.nextInt();
        }
        int m = 0;
        for (int j = 0; j < n; j++) {
            for (int p = 0; p < n; p++) {
                if (M[p] == 0) {
                    System.out.print((p + 1) + " ");
                    break;
                }
            }
            for (int l = m; l < p + 1 - k; l++) {
                M[l]--;
            }
            M[p]--;
        }
    }
}
```

Please note that the Java code above assumes that the input is provided in the same way as the Python code. The Python code reads the input from the console, while the Java code reads it from the standard input.
<|EOT|>
