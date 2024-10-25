<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
Here is the Java version of your Python code:

```java
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        List<String> l = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            l.add(f(sc.next()));
        }
        List<String> perm = permute(l);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (perm.contains(f(sc.next()))) {
                System.out.println("ACC");
            } else {
                System.out.println("WA");
            }
        }
    }

    public static String f(String s) {
        String r = "";
        for (char c : s.toCharArray()) {
            if (c != '-' && c != ';' && c != '_') {
                r += Character.toLowerCase(c);
            }
        }
        return r;
    }

    public static List<String> permute(List<String> l) {
        List<String> result = new ArrayList<>();
        permuteHelper(0, l, result);
        return result;
    }

    public static void permuteHelper(int start, List<String> l, List<String> result) {
        if (start == l.size()) {
            StringBuilder sb = new StringBuilder();
            for (String s : l) {
                sb.append(s);
            }
            result.add(sb.toString());
        } else {
            for (int i = start; i < l.size(); i++) {
                Collections.swap(l, start, i);
                permuteHelper(start + 1, l, result);
                Collections.swap(l, start, i);
            }
        }
    }
}
```

This Java code does the same thing as your Python code. It reads in three strings, generates all permutations of these strings, and then reads in a number of test cases. For each test case, it checks if the test case string is in the list of permutations. If it is, it prints "ACC", otherwise it prints "WA". <｜end▁of▁sentence｜>
