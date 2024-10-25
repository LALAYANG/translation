<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
9.1

Expected output:
GOTO Vasilisa.

```
l = input ( )
l = l.split ( '.' )
s = list ( l [ 0 ] )
p = list ( l [ 1 ] )
i = int ( p [ 0 ] )
if s [ len ( s ) - 1 ] == '9' :
    print ( "GOTO Vasilisa." )
elif s [ len ( s ) - 1 ] != '9' and i < 5 :
    s = "".join ( s )
    print ( s )
else :
    s = "".join ( s )
    s = str ( int ( s ) + 1 )
    print ( s )


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split("\\.");
        String s = parts[0];
        String p = parts[1];
        int i = Integer.parseInt(p.substring(0, 1));
        if (s.charAt(s.length() - 1) == '9') {
            System.out.println("GOTO Vasilisa.");
        } else if (s.charAt(s.length() - 1) != '9' && i < 5) {
            System.out.println(s);
        } else {
            int num = Integer.parseInt(s) + 1;
            System.out.println(num);
        }
    }
}
```
Test input:
9.1

Expected output:
GOTO Vasilisa.

Note: In Java, the `split` method takes a regular expression as its argument, so we need to escape the dot character with a backslash.</s>
