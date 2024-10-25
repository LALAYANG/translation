<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1 10

Expected output:
Positive


```
import bisect , collections , copy , heapq , itertools , math , numpy , string
import sys
def S ( ) : return sys.stdin.readline ( ).rstrip ( )
def I ( ) : return int ( sys.stdin.readline ( ).rstrip ( ) )
def LI ( ) : return list ( map ( int , sys.stdin.readline ( ).rstrip ( ).split ( ) ) )
def LS ( ) : return list ( sys.stdin.readline ( ).rstrip ( ).split ( ) )
a , b = LI ( )
if a > 0 :
    print ( 'Positive' )
elif a <= 0 and b >= 0 :
    print ( 'Zero' )
else :
    if ( a + b ) % 2 == 0 :
        print ( 'Negative' )
    else :
        print ( 'Positive' )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > 0) {
            System.out.println("Positive");
        } else if (a <= 0 && b >= 0) {
            System.out.println("Zero");
        } else {
            if ((a + b) % 2 == 0) {
                System.out.println("Negative");
            } else {
                System.out.println("Positive");
            }
        }
    }
}
```
Note: The `Scanner` class is used to read input from the user in Java, similar to the `sys.stdin.readline()` method in Python. The `nextInt()` method is used to read the next integer from the input stream.</s>
