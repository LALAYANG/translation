<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

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
<|EOT|>
