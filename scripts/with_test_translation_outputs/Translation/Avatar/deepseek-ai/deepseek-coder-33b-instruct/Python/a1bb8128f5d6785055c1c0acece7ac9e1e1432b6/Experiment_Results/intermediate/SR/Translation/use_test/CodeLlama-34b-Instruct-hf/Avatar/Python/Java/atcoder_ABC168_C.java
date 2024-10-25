<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;
import java.lang.Math;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();

        double C = Math.abs(360.0 / 60.0 * m - 360.0 / 12.0 * h - 360.0 / 12.0 / 60.0 * m);
        if (C > 180.0) {
            C = 360.0 - C;
        }
        double cosC = Math.cos(Math.toRadians(C));
        System.out.println(Math.sqrt(a * a + b * b - 2 * a * b * cosC));
    }
}
```
Note: In Java, the `Math.toRadians()` method is used to convert degrees to radians, and the `Math.cos()` method is used to calculate the cosine of an angle in radians.</s>
