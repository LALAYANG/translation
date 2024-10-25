<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

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
<|EOT|>
