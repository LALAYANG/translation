<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
07:12
05:55

Expected output:
01:17


```
h1 , m1 = ( map ( int , input ( ).split ( ':' ) ) )
m1 += h1 * 60
h2 , m2 = ( map ( int , input ( ).split ( ':' ) ) )
m2 += h2 * 60
m2 = m1 - m2
m2 %= 1440
print ( "%02d:%02d" % ( m2 // 60 , m2 % 60 ) )


```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] time1 = scanner.next().split(":");
        String[] time2 = scanner.next().split(":");

        int h1 = Integer.parseInt(time1[0]);
        int m1 = Integer.parseInt(time1[1]);
        m1 += h1 * 60;

        int h2 = Integer.parseInt(time2[0]);
        int m2 = Integer.parseInt(time2[1]);
        m2 += h2 * 60;

        m2 = m1 - m2;
        m2 %= 1440;

        System.out.printf("%02d:%02d", m2 / 60, m2 % 60);
    }
}
```

This Java code does the same thing as the Python code. It reads two times from the standard input, calculates the difference between them, and then prints the result. The difference is calculated in minutes, and then converted back to hours and minutes for the output. The `printf` function is used to format the output with leading zeros if necessary. <｜end▁of▁sentence｜>
