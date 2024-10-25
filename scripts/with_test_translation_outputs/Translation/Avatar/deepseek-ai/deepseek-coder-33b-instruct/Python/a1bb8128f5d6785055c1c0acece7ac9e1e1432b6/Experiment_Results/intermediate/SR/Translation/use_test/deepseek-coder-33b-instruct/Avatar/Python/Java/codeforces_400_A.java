<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
13
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX
XXXXXXXXXXXX

Expected output:
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1
6 1x12 2x6 3x4 4x3 6x2 12x1


```
import collections
import heapq
import sys
import math
import itertools
import bisect
from io import BytesIO , IOBase
import os
def value ( ) : return tuple ( map ( int , input ( ).split ( ) ) )
def values ( ) : return tuple ( map ( int , sys.stdin.readline ( ).split ( ) ) )
def inlst ( ) : return [ int ( i ) for i in input ( ).split ( ) ]
def inlsts ( ) : return [ int ( i ) for i in sys.stdin.readline ( ).split ( ) ]
def inp ( ) : return int ( input ( ) )
def inps ( ) : return int ( sys.stdin.readline ( ) )
def instr ( ) : return input ( )
def stlst ( ) : return [ i for i in input ( ).split ( ) ]
def help ( a , b , l ) :
    tot = [ ]
    for i in range ( b ) :
        tot.append ( l [ i * a : i * a + a ] )
    for i in zip ( * tot ) :
        if sum ( ( i ) ) == b : return True
    return False
def solve ( ) :
    tot = [ ]
    x = instr ( )
    s = [ ]
    for i in x :
        if i == 'O' : s.append ( 0 )
        else : s.append ( 1 )
    for i in range ( 1 , 13 ) :
        if 12 % i == 0 :
            if help ( i , 12 // i , s ) : tot.append ( ( 12 // i , i ) )
    print ( len ( tot ) , end = ' ' )
    for a , b in sorted ( tot ) :
        print ( f'{a}x{b}' , end = ' ' )
    print ( )
if __name__ == "__main__" :
    for i in range ( inp ( ) ) :
        solve ( )


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            solve(input);
        }
    }

    public static void solve(String input) {
        List<Integer> tot = new ArrayList<>();
        int[] s = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'O') {
                s[i] = 0;
            } else {
                s[i] = 1;
            }
        }
        for (int i = 1; i <= 12; i++) {
            if (12 % i == 0) {
                if (help(i, 12 / i, s)) {
                    tot.add(12 / i);
                    tot.add(i);
                }
            }
        }
        System.out.print(tot.size() / 2 + " ");
        for (int i = 0; i < tot.size(); i += 2) {
            System.out.print(tot.get(i) + "x" + tot.get(i + 1) + " ");
        }
        System.out.println();
    }

    public static boolean help(int a, int b, int[] l) {
        int[][] tot = new int[b][a];
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                tot[i][j] = l[i * a + j];
            }
        }
        for (int i = 0; i < a; i++) {
            int sum = 0;
            for (int j = 0; j < b; j++) {
                sum += tot[j][i];
            }
            if (sum == b) {
                return true;
            }
        }
        return false;
    }
}
```
<|EOT|>
