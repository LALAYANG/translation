<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1214
4

Expected output:
2


```
import math , string , itertools , fractions , heapq , collections , re , array , bisect , sys , random , time , copy , functools
sys.setrecursionlimit ( 10 ** 7 )
inf = 10 ** 20
eps = 1.0 / 10 ** 10
mod = 10 ** 9 + 7
dd = [ ( - 1 , 0 ) , ( 0 , 1 ) , ( 1 , 0 ) , ( 0 , - 1 ) ]
ddn = [ ( - 1 , 0 ) , ( - 1 , 1 ) , ( 0 , 1 ) , ( 1 , 1 ) , ( 1 , 0 ) , ( 1 , - 1 ) , ( 0 , - 1 ) , ( - 1 , - 1 ) ]
def LI ( ) : return [ int ( x ) for x in sys.stdin.readline ( ).split ( ) ]
def LI_ ( ) : return [ int ( x ) - 1 for x in sys.stdin.readline ( ).split ( ) ]
def LF ( ) : return [ float ( x ) for x in sys.stdin.readline ( ).split ( ) ]
def LS ( ) : return sys.stdin.readline ( ).split ( )
def I ( ) : return int ( sys.stdin.readline ( ) )
def F ( ) : return float ( sys.stdin.readline ( ) )
def S ( ) : return input ( )
def pf ( s ) : return print ( s , flush = True )
def main ( ) :
    s = S ( )
    k = I ( )
    l = 0
    for c in s :
        if c != '1' :
            break
        l += 1
    if l >= k :
        return 1
    return s [ l ]
print ( main ( ) )


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int k = scanner.nextInt();
        int l = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '1') {
                break;
            }
            l++;
        }
        if (l >= k) {
            System.out.println(1);
        } else {
            System.out.println(s.charAt(l));
        }
    }
}
```
Note: The above code is a Java implementation of the given Python code. The Python code uses the `input()` function to read input from the user, but in Java, we use the `Scanner` class to read input from the user. Also, the Python code uses the `print()` function to print output, but in Java, we use the `System.out.println()` method to print output.</s>
