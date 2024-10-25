<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

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
```java
import java.util.*;

public class Main {
    static boolean debug = false;

    public static void log(String text) {
        if (debug) {
            System.out.println(text);
        }
    }

    public static String[] parseInput(String linesAsString) {
        String[] lines = new String[0];
        if (linesAsString == null) {
            debug = false;
            Scanner scanner = new Scanner(System.in);
            lines = new String[]{scanner.nextLine()};
        } else {
            debug = true;
            lines = linesAsString.split("\n");
        }
        String c = lines[0].split(" ")[0];
        return new String[]{c};
    }

    public static String solve(String c) {
        String a = "abcdefghijklmnopqrstuvwxyz";
        int i = a.indexOf(c);
        return String.valueOf(a.charAt(i + 1));
    }

    public static void main(String[] args) {
        String[] result = solve(parseInput(null)[0]);
        System.out.println(result);
    }
}
```

Please note that the `parseInput` method in the Java version takes a string as input, and the `main` method calls `parseInput` with `null` as argument, which means it reads the input from the console. If you want to test the function with a specific input, you can replace `null` with your input string.
<|EOT|>
