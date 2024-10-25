<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
50 25 1000 1000 50000 25000

Expected output:
1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 

```
def get_nums ( num , t ) :
    return [ t // num + 1 if i in range ( t % num ) else t // num for i in range ( num ) ]
n , k , l , r , sa , sk = map ( int , input ( ).split ( ) )
ans = get_nums ( k , sk ) + get_nums ( n - k , sa - sk )
print ( ' '.join ( map ( str , ans ) ) )


```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int sa = scanner.nextInt();
        int sk = scanner.nextInt();

        int[] ans = new int[n];
        for (int i = 0; i < k; i++) {
            ans[i] = sk / k + (i < sk % k ? 1 : 0);
        }
        for (int i = k; i < n; i++) {
            ans[i] = (sa - sk) / (n - k) + ((i - k) < (sa - sk) % (n - k) ? 1 : 0);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads the input from the user, calculates the numbers and prints them out. The `get_nums` function in the Python code is replaced with two for loops in the Java code. The `range` function in Python is replaced with a for loop in Java. The `//` operator in Python is replaced with `/` in Java. The `%` operator in Python is replaced with `%` in Java. The `+=` operator in Python is replaced with `+=` in Java. The `print` function in Python is replaced with `System.out.print` in Java. The `join` function in Python is replaced with a for loop in Java that prints each number followed by a space.
<|EOT|>
