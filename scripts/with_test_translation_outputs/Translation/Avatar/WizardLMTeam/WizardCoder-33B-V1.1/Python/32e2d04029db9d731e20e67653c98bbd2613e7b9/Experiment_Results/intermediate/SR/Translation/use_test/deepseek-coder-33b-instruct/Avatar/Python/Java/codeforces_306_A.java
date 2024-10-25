<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
81 27

Expected output:
3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 

```
n , m = map ( int , input ( ).split ( ) )
q = n // m
r = n % m
a = [ q ] * m
for i in range ( r ) :
    a [ i ] += 1
for i in range ( m ) :
    print ( a [ i ] , end = ' ' )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int q = n / m;
        int r = n % m;
        int[] a = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = q;
        }
        for (int i = 0; i < r; i++) {
            a[i]++;
        }
        for (int i = 0; i < m; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
```
<|EOT|>
