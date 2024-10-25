<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
179

Expected output:
360


```
from math import gcd
x = int ( input ( ) )
print ( 360 // gcd ( 360 , x ) )


```
[/INST]
```java
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int gcd = gcd(360, x);
        System.out.println(360 / gcd);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
```
Note: In Java, the `gcd` method is not available in the `Math` class, so we need to define it ourselves. The `gcd` method calculates the greatest common divisor of two integers using the Euclidean algorithm.</s>
