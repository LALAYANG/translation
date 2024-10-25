<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
101 171 1 1000000000

Expected output:
57900

```
def G ( a , b ) :
    while a % b != 0 :
        a , b = b , a % b
    return b
def L ( a , b ) :
    return a * b // G ( a , b )
l = input ( ).split ( ' ' )
x , y , a , b = int ( l [ 0 ] ) , int ( l [ 1 ] ) , int ( l [ 2 ] ) , int ( l [ 3 ] )
lcm = L ( x , y )
print ( b // lcm - ( a - 1 ) // lcm )


```
[/INST]
```java
import java.util.Scanner;

public class GCDLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd = gcd(x, y);
        int lcm = lcm(x, y);

        System.out.println(b / lcm - (a - 1) / lcm);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
```
Note: The `gcd` method is a recursive implementation of the Euclidean algorithm for finding the greatest common divisor of two integers. The `lcm` method is a simple implementation of the least common multiple formula.</s>
