<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt();
        while (tc > 0) {
            int a = scanner.nextInt();
            if (a == 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
            tc--;
        }
    }
}
```

Note: In Java, we use the `Scanner` class to read input from the user, and the `System.out.println()` method to print output to the console. The `while` loop is used to iterate over the test cases, and the `if-else` statement is used to determine the output for each test case.</s>
