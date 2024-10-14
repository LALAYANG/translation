<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
-68926616 696880327 -192280079 404308132

Expected output:
281754383236919164


```
import math , itertools , fractions , heapq , collections , bisect , sys , queue , copy
sys.setrecursionlimit ( 10 ** 7 )
inf = 10 ** 20
mod = 10 ** 9 + 7
dd = [ ( - 1 , 0 ) , ( 0 , 1 ) , ( 1 , 0 ) , ( 0 , - 1 ) ]
ddn = [ ( - 1 , 0 ) , ( - 1 , 1 ) , ( 0 , 1 ) , ( 1 , 1 ) , ( 1 , 0 ) , ( 1 , - 1 ) , ( 0 , - 1 ) , ( - 1 , - 1 ) ]
def LI ( ) : return [ int ( x ) for x in sys.stdin.readline ( ).split ( ) ]
def I ( ) : return int ( sys.stdin.readline ( ) )
def F ( ) : return float ( sys.stdin.readline ( ) )
def LS ( ) : return sys.stdin.readline ( ).split ( )
def S ( ) : return input ( )
def main ( ) :
    a , b , c , d = LI ( )
    return max ( a * c , b * d , a * d , b * c )
print ( main ( ) )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int max = Math.max(a * c, b * d);
        max = Math.max(max, a * d);
        max = Math.max(max, b * c);
        System.out.println(max);
    }
}
```
Note: The above code is a Java implementation of the Python code you provided. It uses the `Scanner` class to read input from the user and the `Math.max()` method to find the maximum of the four possible products.</s>
