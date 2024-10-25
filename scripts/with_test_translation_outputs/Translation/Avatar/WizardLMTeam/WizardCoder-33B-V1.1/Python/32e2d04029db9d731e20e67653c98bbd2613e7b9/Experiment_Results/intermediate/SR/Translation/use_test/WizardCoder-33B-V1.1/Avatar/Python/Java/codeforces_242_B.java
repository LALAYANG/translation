<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
6
2 2
3 3
3 5
4 5
1 1
1 5

Expected output:
6


```
import os , sys , io , math
from tokenize import Triple
from math import *
I = lambda : [ * map ( int , sys.stdin.readline ( ).split ( ) ) ]
IS = lambda : input ( )
IN = lambda : int ( input ( ) )
IF = lambda : float ( input ( ) )
n = IN ( )
id = 0
l , r = map ( int , input ( ).split ( ) )
for i in range ( 1 , n ) :
    li , ri = map ( int , input ( ).split ( ) )
    if li <= l and r <= ri : id = i
    elif li < l or r < ri : id = n
    l = min ( l , li )
    r = max ( r , ri )
print ( - 1 if id == n else id + 1 )


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int id = 0;
        int l = sc.nextInt();
        int r = sc.nextInt();
        for (int i = 1; i < n; i++) {
            int li = sc.nextInt();
            int ri = sc.nextInt();
            if (li <= l && r <= ri) {
                id = i;
            } else if (li < l || r < ri) {
                id = n;
            }
            l = Math.min(l, li);
            r = Math.max(r, ri);
        }
        System.out.println(id == n ? -1 : id + 1);
    }
}
```

This Java code does the same thing as the Python code. It reads the number of intervals, then reads each interval. If the current interval is contained within the previous interval, it updates the id to the current index. If the current interval is not contained within the previous interval, it updates the id to n. It then updates the left and right values to the minimum and maximum of the current interval and the previous interval. Finally, it prints the id + 1 if the id is not n, otherwise it prints -1. <｜end▁of▁sentence｜>
