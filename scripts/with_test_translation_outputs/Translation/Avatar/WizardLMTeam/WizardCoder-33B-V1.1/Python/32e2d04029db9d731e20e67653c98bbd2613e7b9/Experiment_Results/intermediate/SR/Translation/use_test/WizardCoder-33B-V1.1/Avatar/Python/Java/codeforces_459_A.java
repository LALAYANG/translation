<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String given = scanner.nextLine();
        String[] l1 = given.split(" ");
        int x1 = Integer.parseInt(l1[0]);
        int y1 = Integer.parseInt(l1[1]);
        int x2 = Integer.parseInt(l1[2]);
        int y2 = Integer.parseInt(l1[3]);
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
        } else if (numerator == 0) {
            int d = (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            int x3 = x1;
            int x4 = x2;
            int y3 = y2 + d;
            int y4 = y1 + d;
            System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
        } else {
            int d = (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            int x3 = x1 + d;
            int x4 = x2 + d;
            int y3 = y1;
            int y4 = y2;
            System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
        }
    }
}
```

Please note that the Python code uses `input()` function to get the input from the user, while the Java code uses `Scanner` class to get the input from the user. Also, the Python code uses `print()` function to print the output, while the Java code uses `System.out.println()` to print the output. <｜end▁of▁sentence｜>
