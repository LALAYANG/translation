<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
Here is the Java version of the Python code:

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

This Java code does the same thing as the Python code. It reads two integers from the standard input, and then checks if the first integer is positive, zero, or negative based on the rules defined in the Python code. <｜end▁of▁sentence｜>
