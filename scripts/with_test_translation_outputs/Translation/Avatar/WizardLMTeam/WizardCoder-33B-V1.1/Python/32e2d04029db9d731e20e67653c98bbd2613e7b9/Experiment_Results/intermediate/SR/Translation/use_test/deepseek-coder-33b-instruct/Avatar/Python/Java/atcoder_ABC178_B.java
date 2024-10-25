<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long d = scanner.nextLong();
        System.out.println(max(a * c, b * d, a * d, b * c));
    }

    public static long max(long... nums) {
        long max = Long.MIN_VALUE;
        for (long num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
```

This Java code reads four long integers from the standard input, calculates the product of each pair of numbers, and prints the maximum product. The `max` method is used to find the maximum value among the given numbers.
<|EOT|>
