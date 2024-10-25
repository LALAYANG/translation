<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        Arrays.sort(A);

        int ans = 0;
        for (int i = 0; i < n - 2; i += 2) {
            ans += A[i];
        }

        System.out.println(ans);
    }
}
```
Note: The above code uses the `Scanner` class to read input from the user. If you want to use the `readInts()` method, you can replace the `Scanner` code with the following:
```java
int[] A = readInts();
```
Also, the `readInts()` method is not a standard Java method, so you will need to define it yourself. Here is an example implementation:
```java
public static int[] readInts() {
    Scanner scanner = new Scanner(System.in);
    int[] A = new int[scanner.nextInt()];
    for (int i = 0; i < A.length; i++) {
        A[i] = scanner.nextInt();
    }
    return A;
}
```</s>
