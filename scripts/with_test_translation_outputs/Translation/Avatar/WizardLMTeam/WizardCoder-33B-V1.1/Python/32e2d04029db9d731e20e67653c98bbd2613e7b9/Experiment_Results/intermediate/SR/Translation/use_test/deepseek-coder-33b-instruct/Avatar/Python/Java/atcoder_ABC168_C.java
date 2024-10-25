<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3 4 10 40

Expected output:
4.56425719433005567605


```
a , b , h , m = map ( int , input ( ).split ( ) )
import math
C = abs ( 360 / 60 * m - 360 / 12 * h - 360 / 12 / 60 * m )
if C > 180 :
    C = 360 - C
cosC = math.cos ( math.radians ( C ) )
print ( math.sqrt ( a ** 2 + b ** 2 - 2 * a * b * cosC ) )


```

### Response:
```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        int m = scanner.nextInt();

        double C = Math.abs(360.0 / 60 * m - 360.0 / 12 * h - 360.0 / 12 / 60 * m);
        if (C > 180) {
            C = 360 - C;
        }
        double cosC = Math.cos(Math.toRadians(C));
        double result = Math.sqrt(a * a + b * b - 2 * a * b * cosC);
        System.out.println(result);
    }
}
```
<|EOT|>
