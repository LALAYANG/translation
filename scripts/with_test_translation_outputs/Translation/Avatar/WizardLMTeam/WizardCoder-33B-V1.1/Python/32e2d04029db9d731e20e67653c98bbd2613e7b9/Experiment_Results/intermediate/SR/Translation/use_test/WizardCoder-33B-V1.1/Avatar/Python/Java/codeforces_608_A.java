<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
2 10
9 3
1 4

Expected output:
12


```
import sys
input = sys.stdin.readline
n , s = map ( int , input ( ).split ( ) )
c = 0
for _ in range ( n ) :
    f , t = map ( int , input ( ).split ( ) )
    x = t - ( s - f )
    if x > c :
        c = x
print ( s + c )


```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int c = 0;
        for (int i = 0; i < n; i++) {
            int f = scanner.nextInt();
            int t = scanner.nextInt();
            int x = t - (s - f);
            if (x > c) {
                c = x;
            }
        }
        System.out.println(s + c);
    }
}
```

This Java code does the same thing as the Python code. It reads the number of test cases and the starting time from the standard input, then for each test case, it reads the finish time and the time it takes to finish the test case. It calculates the time it takes to finish the test case if it starts immediately after the previous one finishes, and if this time is greater than the current maximum, it updates the maximum. Finally, it prints the time when all test cases finish. <｜end▁of▁sentence｜>
