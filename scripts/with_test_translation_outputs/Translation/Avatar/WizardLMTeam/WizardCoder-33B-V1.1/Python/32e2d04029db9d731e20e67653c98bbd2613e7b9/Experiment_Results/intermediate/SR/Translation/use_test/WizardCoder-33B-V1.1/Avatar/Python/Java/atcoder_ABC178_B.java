<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
Here is the Java version of your Python code:

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

    public static long max(long... numbers) {
        long max = numbers[0];
        for (long number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
}
```

This Java code does the same thing as your Python code. It reads four long integers from the standard input, calculates the maximum product of two numbers from each pair of numbers, and prints the maximum of these products. The `max` function is used to find the maximum value in an array of long integers. <｜end▁of▁sentence｜>
