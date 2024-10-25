<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        long x = Long.parseLong(input[0]);
        long y = Long.parseLong(input[1]);
        long a = Long.parseLong(input[2]);
        long b = Long.parseLong(input[3]);

        long lcm = L(x, y);
        System.out.println((b / lcm) - ((a - 1) / lcm));
    }

    public static long G(long a, long b) {
        while (a % b != 0) {
            long temp = a;
            a = b;
            b = temp % b;
        }
        return b;
    }

    public static long L(long a, long b) {
        return (a * b) / G(a, b);
    }
}
```

This Java code does the same thing as the Python code. It reads the input, calculates the least common multiple (LCM) of the first two numbers, and then calculates the number of multiples of the LCM that are in the range from `a` to `b` (inclusive). The `G` function calculates the greatest common divisor (GCD) of two numbers, and the `L` function calculates the LCM of two numbers.
<|EOT|>
