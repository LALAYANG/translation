<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int d = scanner.nextInt();
        int x = scanner.nextInt();

        double ret = 0;
        while (N > 0) {
            ret += d + (N - 0.5) * x;
            d = d + (d / N) + (5 * x) / (2 * N);
            x += 2 * x / N;
            N--;
        }

        System.out.println(ret);
    }
}
```
Note: In Java, the `Scanner` class is used to read input from the user. The `nextInt()` method is used to read the next integer from the input stream. The `println()` method is used to print the output to the console.</s>
