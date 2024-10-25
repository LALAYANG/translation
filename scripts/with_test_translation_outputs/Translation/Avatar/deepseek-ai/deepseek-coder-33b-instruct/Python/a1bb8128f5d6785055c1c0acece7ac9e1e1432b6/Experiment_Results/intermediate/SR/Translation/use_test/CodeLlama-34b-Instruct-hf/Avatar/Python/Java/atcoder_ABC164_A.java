<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

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
[/INST]
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
Note: In Java, we use `Scanner` to read input from the user, and `System.out.println()` to print output to the console.</s>
