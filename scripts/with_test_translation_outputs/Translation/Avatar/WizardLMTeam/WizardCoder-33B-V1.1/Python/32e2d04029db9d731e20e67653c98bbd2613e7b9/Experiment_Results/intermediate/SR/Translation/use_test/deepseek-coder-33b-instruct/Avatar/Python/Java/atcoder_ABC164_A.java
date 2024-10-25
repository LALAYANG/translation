<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

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
<|EOT|>
