<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3 0

Expected output:
1


```
I = input
n , m = map ( int , I ( ).split ( ) )
b = [ 1 ] * n * 2
b [ 0 ] = b [ n - 1 ] = b [ n ] = b [ 2 * n - 1 ] = 0
for i in range ( m ) :
    r , c = map ( int , I ( ).split ( ) )
    b [ r - 1 ] = b [ n + c - 1 ] = 0
if n % 2 and b [ n // 2 ] and b [ n + n // 2 ] : b [ n // 2 ] = 0
print ( sum ( b ) )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] b = new int[n * 2];
        for (int i = 0; i < b.length; i++) {
            b[i] = 1;
        }
        b[0] = b[n - 1] = b[n] = b[2 * n - 1] = 0;
        for (int i = 0; i < m; i++) {
            int r = scanner.nextInt();
            int c = scanner.nextInt();
            b[r - 1] = b[n + c - 1] = 0;
        }
        if (n % 2 == 1 && b[n / 2] == 1 && b[n + n / 2] == 1) {
            b[n / 2] = 0;
        }
        int sum = 0;
        for (int i = 0; i < b.length; i++) {
            sum += b[i];
        }
        System.out.println(sum);
    }
}
```
<|EOT|>
