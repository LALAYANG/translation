<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
Here is the Java version of the Python code:

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
            System.out.print(d.get(i) + " ");
        }
    }
}
```

Please note that in Java, you need to import the `java.util.*` package to use the `Scanner` and `List` classes. Also, the `System.out.print` is used instead of `print` in Python. The `System.out.println` is used to print a new line after printing the integer. The `System.out.print` is used to print the elements of the list separated by a space. <｜end▁of▁sentence｜>
