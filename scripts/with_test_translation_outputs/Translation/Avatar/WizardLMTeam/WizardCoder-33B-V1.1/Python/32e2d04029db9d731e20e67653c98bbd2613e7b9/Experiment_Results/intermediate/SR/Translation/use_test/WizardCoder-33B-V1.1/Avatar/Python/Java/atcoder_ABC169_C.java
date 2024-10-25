<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
Here is the Java version of your Python code:

```java
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        double b = Double.parseDouble(input[1]) * 100 + 0.1;
        System.out.println((int)(a * b / 100));
    }
}
```

This Java code does the same thing as your Python code. It reads two numbers from the standard input, multiplies them, and prints the result. The only difference is that Java uses `BufferedReader` to read input, and it uses `Integer.parseInt()` and `Double.parseDouble()` to convert strings to integers and doubles, respectively. <｜end▁of▁sentence｜>
