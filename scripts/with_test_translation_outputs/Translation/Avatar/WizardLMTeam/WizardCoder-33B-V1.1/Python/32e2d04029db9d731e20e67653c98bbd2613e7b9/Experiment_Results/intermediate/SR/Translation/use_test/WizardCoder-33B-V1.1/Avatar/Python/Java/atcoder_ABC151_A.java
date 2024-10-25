<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
a

Expected output:
b


```
import sys
import math
debug = False
def log ( text ) :
    if debug :
        print ( text )
def parse_input ( lines_as_string = None ) :
    global debug
    lines = [ ]
    if lines_as_string is None :
        debug = False
        lines.append ( input ( ) )
    else :
        debug = True
        lines = [ e for e in lines_as_string.split ( "\n" ) ] [ 1 : - 1 ]
    c = [ e for e in lines [ 0 ].split ( " " ) ] [ 0 ]
    return ( c , )
def solve ( c ) :
    a = "abcdefghijklmnopqrstuvwxyz"
    i = a.index ( c )
    return a [ i + 1 ]
def main ( ) :
    result = solve ( * parse_input ( ) )
    if isinstance ( result , list ) :
        for r in result :
            print ( "%s" % r , sep = '' )
    else :
        print ( "%s" % result , sep = '' )
if __name__ == '__main__' :
    main ( )


```

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String c = scanner.next();
        System.out.println(solve(c));
    }

    public static String solve(String c) {
        String a = "abcdefghijklmnopqrstuvwxyz";
        int i = a.indexOf(c);
        return String.valueOf(a.charAt(i + 1));
    }
}
```

This Java code does the same thing as your Python code. It reads a character from the standard input, finds the next character in the alphabet, and prints it. <｜end▁of▁sentence｜>
