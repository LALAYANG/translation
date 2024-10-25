<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
-100 -100 -100 100

Expected output:
100 -100 100 100


```
import math
given = input ( "" )
l1 = given.split ( )
l1 = [ int ( x ) for x in l1 ]
x1 = l1 [ 0 ]
y1 = l1 [ 1 ]
x2 = l1 [ 2 ]
y2 = l1 [ 3 ]
denominator = x2 - x1
numerator = y2 - y1
if denominator != 0 :
    quotient = numerator / denominator
if numerator == 0 :
    d = int ( math.sqrt ( ( x2 - x1 ) ** 2 + ( y2 - y1 ) ** 2 ) )
    x4 = x1
    x3 = x2
    y3 = y2 + d
    y4 = y1 + d
    print ( f"{x3} {y3} {x4} {y4}" )
elif denominator == 0 :
    y4 = y2
    y3 = y1
    d = int ( math.sqrt ( ( x2 - x1 ) ** 2 + ( y2 - y1 ) ** 2 ) )
    x4 = x1 + d
    x3 = x2 + d
    print ( f"{x3} {y3} {x4} {y4}" )
elif quotient == 1 :
    x4 = x2
    x3 = x1
    y4 = y1
    y3 = y2
    print ( f"{x3} {y3} {x4} {y4}" )
elif quotient == - 1 :
    x4 = x1
    x3 = x2
    y4 = y2
    y3 = y1
    print ( f"{x3} {y3} {x4} {y4}" )
else :
    print ( '-1' )


```

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int denominator = x2 - x1;
        int numerator = y2 - y1;
        if (denominator != 0) {
            double quotient = (double) numerator / denominator;
            if (quotient == 1) {
                System.out.println(x1 + " " + y1 + " " + x2 + " " + y2);
            } else if (quotient == -1) {
                System.out.println(x2 + " " + y2 + " " + x1 + " " + y1);
            } else {
                System.out.println("-1");
            }
        } else {
            int d = (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            int x3 = x1;
            int x4 = x2;
            int y3 = y2 + d;
            int y4 = y1 + d;
            System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
        }
    }
}
```

Please note that this Java code expects the input to be provided through the standard input (console). The input should be provided in the same format as in your Python code. For example, if you want to test the code with the provided test case, you should input `-100 -100 -100 100` when the program is running.
<|EOT|>
