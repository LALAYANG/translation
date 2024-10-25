<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
2 1 0

Expected output:
2.500000000000000


```
import sys
read = sys.stdin.buffer.read
readline = sys.stdin.buffer.readline
readlines = sys.stdin.buffer.readlines
N , d , x = map ( int , read ( ).split ( ) )
def main ( N , d , x ) :
    ret = 0
    while N :
        ret += d + ( N - 0.5 ) * x
        d = d + ( d / N ) + ( 5 * x ) / ( 2 * N )
        x += 2 * x / N
        N -= 1
    return ret
print ( main ( N , d , x ) )


```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double d = scanner.nextDouble();
        double x = scanner.nextDouble();
        System.out.println(main(N, d, x));
    }

    public static double main(int N, double d, double x) {
        double ret = 0;
        while (N > 0) {
            ret += d + (N - 0.5) * x;
            d = d + (d / N) + (5 * x) / (2 * N);
            x += 2 * x / N;
            N--;
        }
        return ret;
    }
}
```

This Java code does the same thing as the Python code. It reads three numbers from the standard input, calls the `main` method with these numbers, and then prints the result. The `main` method calculates the sum of a series of values based on the input numbers and returns this sum. <｜end▁of▁sentence｜>
