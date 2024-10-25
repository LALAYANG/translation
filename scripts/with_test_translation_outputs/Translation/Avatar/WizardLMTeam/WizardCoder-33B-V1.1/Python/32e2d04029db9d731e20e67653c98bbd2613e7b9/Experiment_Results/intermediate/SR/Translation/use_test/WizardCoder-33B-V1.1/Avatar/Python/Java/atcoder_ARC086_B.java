<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
4
5 6 8 10

Expected output:
0


```
import sys
import math
from collections import defaultdict
sys.setrecursionlimit ( 10 ** 7 )
def input ( ) :
    return sys.stdin.readline ( ) [ : - 1 ]
mod = 10 ** 9 + 7
def I ( ) : return int ( input ( ) )
def II ( ) : return map ( int , input ( ).split ( ) )
def III ( ) : return list ( map ( int , input ( ).split ( ) ) )
def Line ( N , num ) :
    if N <= 0 :
        return [ [ ] ] * num
    elif num == 1 :
        return [ I ( ) for _ in range ( N ) ]
    else :
        read_all = [ tuple ( II ( ) ) for _ in range ( N ) ]
        return map ( list , zip ( * read_all ) )
def my_sign ( x ) :
    return ( x > 0 ) - ( x < 0 )
N = I ( )
a = III ( )
max_val = 0
max_sign = 0
max_index = - 1
for i , a0 in enumerate ( a ) :
    if abs ( a0 ) > max_val :
        max_val = abs ( a0 )
        max_sign = my_sign ( a0 )
        max_index = i
if max_sign == 0 :
    print ( 0 )
elif max_sign == 1 :
    print ( 2 * N - 1 )
    for i in range ( N ) :
        print ( max_index + 1 , i + 1 )
    for i in range ( N - 1 ) :
        print ( i + 1 , i + 2 )
else :
    print ( 2 * N - 1 )
    for i in range ( N ) :
        print ( max_index + 1 , i + 1 )
    for i in range ( 1 , N ) [ : : - 1 ] :
        print ( i + 1 , i )


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        int max_val = 0;
        int max_sign = 0;
        int max_index = -1;
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
            if (Math.abs(a[i]) > max_val) {
                max_val = Math.abs(a[i]);
                max_sign = Integer.compare(a[i], 0);
                max_index = i;
            }
        }
        if (max_sign == 0) {
            System.out.println(0);
        } else if (max_sign == 1) {
            System.out.println(2 * N - 1);
            for (int i = 0; i < N; i++) {
                System.out.println((max_index + 1) + " " + (i + 1));
            }
            for (int i = 0; i < N - 1; i++) {
                System.out.println((i + 1) + " " + (i + 2));
            }
        } else {
            System.out.println(2 * N - 1);
            for (int i = 0; i < N; i++) {
                System.out.println((max_index + 1) + " " + (i + 1));
            }
            for (int i = N - 1; i > 0; i--) {
                System.out.println((i + 1) + " " + i);
            }
        }
    }
}
``` <｜end▁of▁sentence｜>
