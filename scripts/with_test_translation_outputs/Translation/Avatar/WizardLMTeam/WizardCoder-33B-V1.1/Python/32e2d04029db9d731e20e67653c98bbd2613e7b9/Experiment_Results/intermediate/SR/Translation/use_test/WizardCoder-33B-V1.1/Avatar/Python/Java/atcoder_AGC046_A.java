<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(360 / gcd(360, x));
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the standard input, calculates the greatest common divisor (gcd) of 360 and the input number, and then prints the result of dividing 360 by the gcd. The gcd function is a recursive implementation of the Euclidean algorithm for finding the greatest common divisor of two integers. <｜end▁of▁sentence｜>
