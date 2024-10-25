<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
10 10
-1 1 -1 1 -1 -1 -1 -1 -1 -1
6 7
2 5
3 6
1 3
3 5
4 5
3 4
1 6
1 1
1 1

Expected output:
1
1
1
0
0
1
1
0
0
0


```
n , m = map ( int , input ( ).split ( ) )
sa = input ( ).count ( "-" )
sa = min ( [ n - sa , sa ] )
ss = [ ]
for _ in range ( m ) :
    a , b = map ( int , input ( ).split ( ) )
    b -= a
    ss.append ( ( b % 2 and b <= sa << 1 ) and "1\n" or "0\n" )
print ( "".join ( ss ) )


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int sa = 0;
        for (int i = 0; i < n; i++) {
            if (scanner.nextInt() < 0) {
                sa++;
            }
        }
        sa = Math.min(n - sa, sa);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            b -= a;
            if (b % 2 == 1 && b <= sa * 2) {
                sb.append("1\n");
            } else {
                sb.append("0\n");
            }
        }
        System.out.print(sb.toString());
    }
}
```
<|EOT|>
