<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
            if (scanner.nextInt() == -1) {
                sa++;
            }
        }
        sa = Math.min(sa, n - sa);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int diff = b - a;
            if (diff % 2 == 1 && diff <= sa * 2) {
                sb.append("1\n");
            } else {
                sb.append("0\n");
            }
        }
        System.out.print(sb.toString());
    }
}
```

This Java code does the same thing as the Python code. It reads the input, calculates the minimum of the number of -1s and the number of 1s, and then checks for each pair of numbers if the difference is odd and less than or equal to twice the minimum. If it is, it appends "1\n" to the StringBuilder, otherwise it appends "0\n". Finally, it prints the StringBuilder. <｜end▁of▁sentence｜>
