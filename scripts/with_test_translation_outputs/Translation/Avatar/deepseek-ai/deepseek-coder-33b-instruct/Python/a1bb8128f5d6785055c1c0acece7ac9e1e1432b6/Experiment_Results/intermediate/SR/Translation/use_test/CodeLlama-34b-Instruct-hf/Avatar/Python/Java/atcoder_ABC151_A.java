<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = solve(input);
        System.out.println(output);
    }

    public static String solve(String input) {
        String[] letters = "abcdefghijklmnopqrstuvwxyz".split(" ");
        int index = letters.indexOf(input);
        return letters[index + 1];
    }
}
```
Note: In Java, the `split()` method is used to split a string into an array of substrings, rather than the `split()` method used in Python. Also, the `indexOf()` method is used to find the index of a substring within a string, rather than the `index()` method used in Python.</s>
