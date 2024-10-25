<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
0

Expected output:
1


```
import os
from sys import stdin , stdout
def solve ( tc ) :
    a = int ( stdin.readline ( ).strip ( ) )
    print ( 1 if a == 0 else 0 )
tcs = 1
tc = 1
while tc <= tcs :
    solve ( tc )
    tc += 1


```

### Response:
Here is the Java equivalent of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tcs = 1;
        int tc = 1;
        while (tc <= tcs) {
            solve(scanner, tc);
            tc += 1;
        }
        scanner.close();
    }

    public static void solve(Scanner scanner, int tc) {
        int a = scanner.nextInt();
        System.out.println(a == 0 ? 1 : 0);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, checks if it's zero, and prints 1 if it is, or 0 if it's not. The `Scanner` class is used to read input from the standard input. The `System.out.println` method is used to print output to the standard output. <｜end▁of▁sentence｜>
