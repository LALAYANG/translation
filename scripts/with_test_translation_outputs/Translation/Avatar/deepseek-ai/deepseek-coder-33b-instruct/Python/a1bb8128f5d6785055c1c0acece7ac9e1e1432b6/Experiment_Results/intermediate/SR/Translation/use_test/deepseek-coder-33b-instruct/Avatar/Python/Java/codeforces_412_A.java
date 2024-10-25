<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3 1
.VP

Expected output:
PRINT .
RIGHT
PRINT V
RIGHT
PRINT P


```
n , k = map ( int , input ( ).split ( ) )
v = input ( )
d = [ "LEFT" , "RIGHT" ]
f = k - 1 < n - k
m = min ( k - 1 , n - k )
a = [ ]
for i in range ( 0 , m ) :
    a.append ( d [ not f ] )
for i in v [ : : - 1 + 2 * f ] :
    a.append ( "PRINT " + i )
    a.append ( d [ f ] )
print ( * a [ : - 1 ] , sep = "\n" )


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String v = scanner.next();
        String[] d = {"LEFT", "RIGHT"};
        boolean f = k - 1 < n - k;
        int m = Math.min(k - 1, n - k);
        ArrayList<String> a = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            a.add(d[f ? 0 : 1]);
        }
        StringBuilder sb = new StringBuilder(v);
        for (int i = 0; i < sb.length(); i++) {
            a.add("PRINT " + sb.charAt(i));
            if (i < m) {
                a.add(d[f ? 1 : 0]);
            }
        }
        for (int i = 0; i < a.size() - 1; i++) {
            System.out.println(a.get(i));
        }
    }
}
```

This Java code does the same thing as the Python code you provided. It reads the input, performs the same operations, and prints the result. The main difference is that Java uses `System.out.println` to print the output instead of `print`. Also, Java uses `ArrayList` instead of Python's list and `StringBuilder` instead of Python's string.
<|EOT|>
