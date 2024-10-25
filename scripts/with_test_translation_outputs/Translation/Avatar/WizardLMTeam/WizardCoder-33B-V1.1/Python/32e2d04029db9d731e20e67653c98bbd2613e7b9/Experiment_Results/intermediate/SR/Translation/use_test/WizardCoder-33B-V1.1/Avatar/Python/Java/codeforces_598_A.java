<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
10
1
2
3
4
5
6
7
8
9
10

Expected output:
-1
-3
0
-4
1
7
14
6
15
25


```
t = int ( input ( ) )
def solve ( n ) :
    s = ( 1 + n ) * n // 2
    t = 1
    while t <= n :
        s -= 2 * t
        t *= 2
    return s
for _ in range ( t ) :
    n = int ( input ( ) )
    print ( solve ( n ) )


```

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            System.out.println(solve(n));
        }
    }

    public static int solve(int n) {
        int s = (1 + n) * n / 2;
        int t = 1;
        while (t <= n) {
            s -= 2 * t;
            t *= 2;
        }
        return s;
    }
}
```

This Java code does the same thing as your Python code. It reads an integer `t` from the standard input, then reads `t` more integers from the standard input, and for each integer, it calls the `solve` method and prints the result. The `solve` method calculates the sum of all integers from 1 to `n`, then subtracts all powers of 2 less than or equal to `n` from this sum. <｜end▁of▁sentence｜>
