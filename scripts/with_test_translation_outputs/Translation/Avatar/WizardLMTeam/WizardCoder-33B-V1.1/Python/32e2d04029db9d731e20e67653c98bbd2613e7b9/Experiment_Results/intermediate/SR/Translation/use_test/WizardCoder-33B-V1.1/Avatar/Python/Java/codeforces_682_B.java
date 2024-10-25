<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
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

This Java code does the same thing as the Python code. It reads an integer n and an array of n integers from the standard input, sorts the array, and then iterates over the sorted array to find the smallest integer greater than the current maximum. The result is printed to the standard output. <｜end▁of▁sentence｜>
