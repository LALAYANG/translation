<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
0 9.98

Expected output:
0


```
def main ( ) :
    from sys import setrecursionlimit , stdin
    from os import environ
    from collections import defaultdict , deque , Counter
    from math import ceil , floor , gcd
    from itertools import accumulate , combinations , combinations_with_replacement
    setrecursionlimit ( 10 ** 6 )
    dbg = ( lambda * something : print ( * something ) ) if 'TERM_PROGRAM' in environ else lambda * x : 0
    input = lambda : stdin.readline ( ).rstrip ( )
    LMIIS = lambda : list ( map ( int , input ( ).split ( ) ) )
    II = lambda : int ( input ( ) )
    P = 10 ** 9 + 7
    INF = 10 ** 9 + 10
    sa , sb = input ( ).split ( )
    a = int ( sa )
    b = int ( float ( sb ) * 100 + 0.1 )
    print ( a * b // 100 )
main ( )


```

### Response:
```java
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = (int) (Float.parseFloat(input[1]) * 100 + 0.1);
        System.out.println(a * b / 100);
    }
}
```
<|EOT|>
