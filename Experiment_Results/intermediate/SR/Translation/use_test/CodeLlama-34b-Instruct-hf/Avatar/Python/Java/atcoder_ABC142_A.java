<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;

public class NextInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = 0;
        for (int i = 0; i < n; i++) {
            if (i + 1 % 2 == 1) {
                t++;
            }
        }
        System.out.println(t / (double)n);
    }
}
```
Note: In Java, the `input()` method is not available, so we use `Scanner` class to read input from the user. Also, we need to cast the input to `int` using `Integer.parseInt()` method.</s>
