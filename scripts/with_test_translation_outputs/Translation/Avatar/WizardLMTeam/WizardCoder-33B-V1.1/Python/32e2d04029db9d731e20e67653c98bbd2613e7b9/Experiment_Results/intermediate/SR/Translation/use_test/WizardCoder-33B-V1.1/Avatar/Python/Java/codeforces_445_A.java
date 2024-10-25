<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        char[][] l = new char[n][m];

        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            for (int j = 0; j < m; j++) {
                if (s.charAt(j) == '.') {
                    if ((i + j) % 2 == 1) {
                        l[i][j] = 'W';
                    } else {
                        l[i][j] = 'B';
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(l[i][j]);
            }
            System.out.println();
        }
    }
}
```

This Java code does the same thing as the Python code. It reads the size of the matrix from the input, then reads each row of the matrix. For each cell in the matrix, if the cell contains a dot, it replaces the dot with 'W' if the sum of the row and column index is odd, and with 'B' if the sum is even. Finally, it prints the resulting matrix. <｜end▁of▁sentence｜>
