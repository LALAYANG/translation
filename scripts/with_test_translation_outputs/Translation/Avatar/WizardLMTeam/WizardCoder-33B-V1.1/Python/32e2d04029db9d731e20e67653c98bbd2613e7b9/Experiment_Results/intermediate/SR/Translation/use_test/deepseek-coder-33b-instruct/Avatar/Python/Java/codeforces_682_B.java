<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
7
1 3 3 3 3 3 6

Expected output:
5


```
import os , sys , io , math
from array import array
from math import *
I = lambda : [ * map ( int , sys.stdin.readline ( ).split ( ) ) ]
IS = lambda : input ( )
IN = lambda : int ( input ( ) )
IF = lambda : float ( input ( ) )
n = IN ( )
l = I ( )
f = 1
l.sort ( )
c = 0
for i in l :
    if i > c : c += 1
print ( c + 1 )


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
        }
        Arrays.sort(l);
        int c = 0;
        for (int i : l) {
            if (i > c) {
                c++;
            }
        }
        System.out.println(c + 1);
    }
}
```
<|EOT|>
