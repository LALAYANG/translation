<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
16 70

Expected output:
70 85

```
n , m = map ( int , input ( ).split ( ) )
if n < 1 :
    if m < 1 :
        print ( n , m )
        quit ( )
    print ( "Impossible" )
    quit ( )
if m > n :
    min = m
    max = n + m - 1
    print ( min , max )
if m <= n :
    min = n
    max = n + m - 1
    if m == 0 :
        max = n
    print ( min , max )


```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int min, max;

        if (n < 1) {
            if (m < 1) {
                System.out.println(n + " " + m);
                System.exit(0);
            } else {
                System.out.println("Impossible");
                System.exit(0);
            }
        }

        if (m > n) {
            min = m;
            max = n + m - 1;
            System.out.println(min + " " + max);
        }

        if (m <= n) {
            min = n;
            max = n + m - 1;
            if (m == 0) {
                max = n;
            }
            System.out.println(min + " " + max);
        }
    }
}
```

This Java code does the same thing as the provided Python code. It reads two integers from the standard input, performs some calculations, and prints the results. If `n` is less than 1, it checks if `m` is less than 1. If it is, it prints `n` and `m` and then terminates the program. If `m` is not less than 1, it prints "Impossible" and then terminates the program. If `m` is greater than `n`, it calculates the minimum and maximum values and prints them. If `m` is less than or equal to `n`, it also calculates the minimum and maximum values, but if `m` is 0, it sets the maximum value to `n`. It then prints the minimum and maximum values. <｜end▁of▁sentence｜>
