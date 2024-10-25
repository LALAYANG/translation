<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
4
5 6 5 5

Expected output:
0


```
import sys
input = sys.stdin.readline
n = int ( input ( ) )
w = list ( map ( int , input ( ).split ( ) ) )
x = sum ( w )
d = [ ]
for i in range ( n ) :
    if ( x - w [ i ] ) / ( n - 1 ) == w [ i ] :
        d.append ( i + 1 )
print ( len ( d ) )
print ( ' '.join ( map ( str , d ) ) )


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] w = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt();
            sum += w[i];
        }
        List<Integer> d = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if ((sum - w[i]) / (n - 1) == w[i]) {
                d.add(i + 1);
            }
        }
        System.out.println(d.size());
        for (int i = 0; i < d.size(); i++) {
            System.out.print(d.get(i));
            if (i != d.size() - 1) {
                System.out.print(" ");
            }
        }
    }
}
```
<|EOT|>
