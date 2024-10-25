<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
2

Expected output:
-1


```
from sys import stdin , stdout , setrecursionlimit
from math import gcd , ceil , sqrt
from collections import Counter
from bisect import bisect_left , bisect_right
ii1 = lambda : int ( stdin.readline ( ).strip ( ) )
is1 = lambda : stdin.readline ( ).strip ( )
iia = lambda : list ( map ( int , stdin.readline ( ).strip ( ).split ( ) ) )
isa = lambda : stdin.readline ( ).strip ( ).split ( )
setrecursionlimit ( 100000 )
mod = 1000000007
k = ii1 ( )
t = 0
for i in range ( 1 , k + 1 ) :
    t = ( t % k ) * 10 + 7
    if t % k == 0 :
        print ( i )
        break
else :
    print ( - 1 )


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int t = 0;
        for (int i = 1; i <= k; i++) {
            t = (t % k) * 10 + 7;
            if (t % k == 0) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
```
<|EOT|>
