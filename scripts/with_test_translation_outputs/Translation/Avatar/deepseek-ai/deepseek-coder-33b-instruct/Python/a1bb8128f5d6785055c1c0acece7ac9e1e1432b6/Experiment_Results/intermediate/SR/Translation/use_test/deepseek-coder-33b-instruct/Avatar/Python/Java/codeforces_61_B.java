<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
as
av
ax
1
-------

Expected output:
WA


```
import collections
import heapq
import sys
import math
import itertools
import bisect
from io import BytesIO , IOBase
import os
def valid ( i , j , n , m ) :
    if i < n and i >= 0 and j >= 0 and j < m : return True
    return False
def sumn ( i , n ) :
    return ( n - i ) * ( i + n ) / 2
def sqfun ( a , b , c ) :
    return ( - b + math.sqrt ( b * b - 4 * a * c ) ) / 2 * a
def value ( ) : return tuple ( map ( int , input ( ).split ( ) ) )
def values ( ) : return tuple ( map ( int , sys.stdin.readline ( ).split ( ) ) )
def inlst ( ) : return [ int ( i ) for i in input ( ).split ( ) ]
def inlsts ( ) : return [ int ( i ) for i in sys.stdin.readline ( ).split ( ) ]
def inp ( ) : return int ( input ( ) )
def inps ( ) : return int ( sys.stdin.readline ( ) )
def instr ( ) : return input ( )
def stlst ( ) : return [ i for i in input ( ).split ( ) ]
def f ( s ) :
    r = ''
    for i in s :
        if i not in [ '-' , ';' , '_' ] : r += i.lower ( )
    return r
def solve ( ) :
    l = [ ]
    for i in range ( 3 ) :
        l.append ( f ( input ( ) ) )
    t = itertools.permutations ( l , len ( l ) )
    l = [ ]
    for i in t : l.append ( "".join ( i ) )
    for i in range ( inp ( ) ) :
        if f ( instr ( ) ) in l : print ( 'ACC' )
        else : print ( 'WA' )
if __name__ == "__main__" :
    solve ( )


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> l = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            l.add(f(scanner.next()));
        }
        List<String> permutations = new ArrayList<>();
        permute(l, 0, l.size() - 1, permutations);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            if (permutations.contains(f(scanner.next()))) {
                System.out.println("ACC");
            } else {
                System.out.println("WA");
            }
        }
    }

    private static void permute(List<String> arr, int l, int r, List<String> permutations) {
        if (l == r) {
            StringBuilder sb = new StringBuilder();
            for (String s : arr) {
                sb.append(s);
            }
            permutations.add(sb.toString());
        } else {
            for (int i = l; i <= r; i++) {
                arr = swap(arr, l, i);
                permute(arr, l + 1, r, permutations);
                arr = swap(arr, l, i);
            }
        }
    }

    private static List<String> swap(List<String> a, int i, int j) {
        Collections.swap(a, i, j);
        return a;
    }

    private static String f(String s) {
        StringBuilder r = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != '-' && c != ';' && c != '_') {
                r.append(Character.toLowerCase(c));
            }
        }
        return r.toString();
    }
}
```
<|EOT|>
