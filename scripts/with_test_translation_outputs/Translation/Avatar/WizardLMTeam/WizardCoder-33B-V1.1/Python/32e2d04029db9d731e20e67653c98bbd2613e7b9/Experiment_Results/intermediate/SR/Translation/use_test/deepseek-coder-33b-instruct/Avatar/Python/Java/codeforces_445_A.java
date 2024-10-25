<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
2 5
.....
.....

Expected output:
BWBWB
WBWBW


```
n , m = map ( int , input ( ).split ( ) )
l = [ ]
for i in range ( n ) :
    s = input ( )
    s = list ( s )
    for j in range ( m ) :
        if s [ j ] == '.' :
            if ( i + j ) & 1 : s [ j ] = 'W'
            else : s [ j ] = 'B'
    l.append ( s )
for c in l : print ( "".join ( c ) )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String[] l = new String[n];
        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            char[] chars = s.toCharArray();
            for (int j = 0; j < m; j++) {
                if (chars[j] == '.') {
                    if ((i + j) % 2 == 1) chars[j] = 'W';
                    else chars[j] = 'B';
                }
            }
            l[i] = new String(chars);
        }
        for (String c : l) System.out.println(c);
    }
}
```
<|EOT|>
