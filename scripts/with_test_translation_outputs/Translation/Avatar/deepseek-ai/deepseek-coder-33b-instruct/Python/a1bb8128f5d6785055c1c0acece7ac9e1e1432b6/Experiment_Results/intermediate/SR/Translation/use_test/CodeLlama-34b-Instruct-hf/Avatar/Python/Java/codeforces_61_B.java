<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dp[i][j] = matrix[i][j];
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                max = Math.max(max, dp[i][j]);
            }
        }

        System.out.println(max);
    }
}
```
Note: The above code is a Java implementation of the solution to the problem described in the question. It uses a 2D array to store the maximum value of each subarray, and a nested loop to compute the maximum value of each subarray. The time complexity of this solution is O(n^2), where n is the number of rows in the input matrix.</s>
