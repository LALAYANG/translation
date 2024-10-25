<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

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
<|EOT|>
