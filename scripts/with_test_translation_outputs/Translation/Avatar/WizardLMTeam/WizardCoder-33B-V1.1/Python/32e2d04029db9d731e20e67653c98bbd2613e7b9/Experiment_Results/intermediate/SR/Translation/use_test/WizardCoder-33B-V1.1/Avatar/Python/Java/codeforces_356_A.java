<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3 2
2 3 3
1 3 3

Expected output:
3 3 0 

```
n , m = map ( int , input ( ).strip ( ).split ( ) )
out = [ 0 for _ in range ( n ) ]
comp = [ i + 2 for i in range ( n ) ]
for _ in range ( m ) :
    l , r , x = map ( int , input ( ).strip ( ).split ( ) )
    t = l
    while t <= r :
        next_val = comp [ t - 1 ]
        if out [ t - 1 ] == 0 and t != x :
            out [ t - 1 ] = x
        comp [ t - 1 ] = r + 1 if t >= x else x
        t = next_val
print ( * out )


```

### Response:
Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] out = new int[n];
        int[] comp = new int[n];
        for (int i = 0; i < n; i++) {
            comp[i] = i + 2;
        }
        for (int i = 0; i < m; i++) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            int x = scanner.nextInt();
            int t = l;
            while (t <= r) {
                int next_val = comp[t - 1];
                if (out[t - 1] == 0 && t != x) {
                    out[t - 1] = x;
                }
                comp[t - 1] = r + 1;
                if (t < x) {
                    comp[t - 1] = x;
                }
                t = next_val;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(out[i] + " ");
        }
    }
}
```

Please note that this Java code is assuming that the input is provided in the same way as the Python code. The input format is different in Java and Python. In Java, you need to provide the input in a single line separated by spaces. For example, if you want to provide the input for the test case provided in the question, you need to provide the input as:

3 2 2 3 3 1 3 3

This will be equivalent to the Python code's input format. <｜end▁of▁sentence｜>
