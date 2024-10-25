<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3 2
1 1

Expected output:
YES


```
import sys
n , t = map ( int , input ( ).split ( ) )
s = list ( [ int ( x ) for x in input ( ).split ( ) ] )
current_cell = 0
while current_cell <= t :
    current_cell += s [ current_cell - 1 ]
    if current_cell == t :
        print ( "YES" )
        sys.exit ( )
    else :
        continue
print ( "NO" )


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = scanner.nextInt();
        }
        int current_cell = 1;
        while (current_cell <= t) {
            current_cell += s[current_cell - 1];
            if (current_cell == t) {
                System.out.println("YES");
                System.exit(0);
            }
        }
        System.out.println("NO");
    }
}
```
<|EOT|>
