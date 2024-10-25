<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
98

Expected output:
0.5000000000


```
from math import *
def next_int ( ) :
    return int ( input ( ) )
def next_ints ( ) :
    return list ( map ( int , input ( ).split ( ) ) )
n = next_int ( )
t = 0
for i in range ( n ) :
    if i + 1 & 1 :
        t += 1
print ( t / n )


```

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double t = 0;
        for (int i = 0; i < n; i++) {
            if ((i + 1) % 2 != 0) {
                t += 1;
            }
        }
        System.out.println(t / n);
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the standard input, then calculates the ratio of odd numbers to the total count of numbers up to that integer. The result is then printed to the standard output. <｜end▁of▁sentence｜>
