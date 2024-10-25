<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

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
<|EOT|>
