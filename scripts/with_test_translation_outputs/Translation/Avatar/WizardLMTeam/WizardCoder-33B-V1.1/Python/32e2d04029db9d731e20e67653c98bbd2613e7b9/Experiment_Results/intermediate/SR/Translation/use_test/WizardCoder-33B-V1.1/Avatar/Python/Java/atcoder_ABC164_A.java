<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
100 2

Expected output:
safe


```
import sys
def main ( ) :
    S , W = map ( int , input ( ).split ( ) )
    print ( "unsafe" ) if ( S <= W ) else print ( "safe" )
if __name__ == '__main__' :
    main ( )


```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();
        int W = scanner.nextInt();
        if (S <= W) {
            System.out.println("unsafe");
        } else {
            System.out.println("safe");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input (`System.in`), and then it checks if the first integer is less than or equal to the second one. If it is, it prints "unsafe", otherwise it prints "safe". <｜end▁of▁sentence｜>
