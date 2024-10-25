<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3
161660740 8952127 99 451347 8130 7559 80 279056630 512

Expected output:
162119646


```
from statistics import median
from fractions import gcd
from itertools import combinations
from collections import deque
from collections import defaultdict
import bisect
import sys
sys.setrecursionlimit ( 10000000 )
mod = 10 ** 9 + 7
def readInts ( ) :
    return list ( map ( int , input ( ).split ( ) ) )
def main ( ) :
    n = int ( input ( ) )
    A = readInts ( )
    A = sorted ( A )
    ans = 0
    for i in range ( len ( A ) - 2 , len ( A ) - 2 * n - 1 , - 2 ) :
        ans += A [ i ]
    print ( ans )
if __name__ == '__main__' :
    main ( )


```

### Response:
Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            A[i] = scanner.nextInt();
        }
        Arrays.sort(A);
        long ans = 0;
        for (int i = 2 * n - 2; i >= 2 * n - 2 * n; i -= 2) {
            ans += A[i];
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `n`, then reads `2n` integers into an array `A`. It sorts the array in ascending order, then sums up every second element from the end of the array, and prints the result. <｜end▁of▁sentence｜>
