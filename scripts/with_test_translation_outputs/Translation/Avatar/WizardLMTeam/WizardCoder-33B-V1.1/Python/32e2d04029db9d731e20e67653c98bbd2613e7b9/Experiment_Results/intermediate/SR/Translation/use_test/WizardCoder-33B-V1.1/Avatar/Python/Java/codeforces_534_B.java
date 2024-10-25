<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
100 100
100 10

Expected output:
34500

```
v1 , v2 = input ( ).split ( )
t , d = input ( ).split ( )
v1 = int ( v1 )
v2 = int ( v2 )
t = int ( t )
d = int ( d )
a = 1
v = v1
distance = 0
for i in range ( t ) :
    if v - v2 > ( t - i - 1 ) * d :
        a *= - 1
        v = ( t - i - 1 ) * d + v2
    distance += v
    v += a * d
print ( distance )


```

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v1 = scanner.nextInt();
        int v2 = scanner.nextInt();
        int t = scanner.nextInt();
        int d = scanner.nextInt();
        int a = 1;
        int v = v1;
        int distance = 0;
        for (int i = 0; i < t; i++) {
            if (v - v2 > (t - i - 1) * d) {
                a *= -1;
                v = (t - i - 1) * d + v2;
            }
            distance += v;
            v += a * d;
        }
        System.out.println(distance);
    }
}
```

This Java code does the same thing as your Python code. It reads four integers from the standard input, performs the same calculations, and prints the result.

Please note that in Java, you need to import the `java.util.Scanner` class to read input from the standard input. Also, you need to create a `Scanner` object and use its `nextInt()` method to read integers from the standard input. <｜end▁of▁sentence｜>
