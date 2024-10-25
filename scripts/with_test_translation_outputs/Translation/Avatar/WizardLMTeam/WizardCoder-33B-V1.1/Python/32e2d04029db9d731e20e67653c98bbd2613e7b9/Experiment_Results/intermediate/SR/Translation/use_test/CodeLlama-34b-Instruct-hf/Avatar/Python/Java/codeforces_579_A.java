<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
117422204

Expected output:
19


```
import math
n = int ( input ( ) )
x = 1
while math.log2 ( n ) % 1 :
    x += 1
    n -= 2 ** ( int ( math.log2 ( n ) ) )
print ( x )


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = 1;
        while (Math.log(n) % 1 != 0) {
            x++;
            n -= Math.pow(2, (int) Math.log(n));
        }
        System.out.println(x);
    }
}
```
Note: In Java, the `Math.log()` method returns the natural logarithm (base e) of a number, so we need to use `Math.log2()` to get the logarithm base 2. Also, the `Math.pow()` method is used to calculate the power of 2.</s>
