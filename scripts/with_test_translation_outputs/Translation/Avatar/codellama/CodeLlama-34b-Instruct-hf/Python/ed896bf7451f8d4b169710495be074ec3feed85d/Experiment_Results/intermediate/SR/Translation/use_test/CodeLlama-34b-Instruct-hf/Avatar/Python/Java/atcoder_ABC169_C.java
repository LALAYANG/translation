<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] sa = scanner.nextLine().split(" ");
        int a = Integer.parseInt(sa[0]);
        int b = (int) (Float.parseFloat(sa[1]) * 100 + 0.1);
        System.out.println(a * b / 100);
    }
}
```
Note: In Java, we use the `Scanner` class to read input from the user. We also use the `Integer.parseInt()` method to convert a string to an integer, and the `Float.parseFloat()` method to convert a string to a float. Finally, we use the `/` operator to perform integer division and get the result as an integer.</s>
